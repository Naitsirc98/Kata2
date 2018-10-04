package kata2;

import java.util.Map;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Kata2 extends Application {
	
	private static Histogram<?> histogram;
	
	public static void main(String[] args) {
		
		final String[] data = {"Java","C++","C#","Java","JavaScript","C#","Java",
				"Python","C++","C++","Ruby","JavaScript","Assembly","Python", "Java",
				"C","Rust","Pascal","C","C","Java","C++","Java","Ruby","Ruby","C#",
				"C#","C++"};
		
		Kata2.setHistogram(new Histogram<>(data));
		
		launch();
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		stage.setTitle("HistogramFX by Naitsirc98 Kata2 IS2");
		
		stage.setScene(new Scene(new StackPane(getBarChart()),
				900, 600, true, SceneAntialiasing.BALANCED));
		
		stage.sizeToScene();
		
		stage.show();
		
	}
	
	private Node getBarChart() {
		
		final Map<?, Integer> results = histogram.getHistogram();
		
		final CategoryAxis x = new CategoryAxis();
		x.setLabel("Values");
		final NumberAxis y = new NumberAxis();
		y.setLabel("Frequency");
		
		final BarChart<String, Number> chart = new BarChart<>(x,y);
		
		final Series<String, Number> series = new Series<>();
		
		results.forEach((k,v) -> {
			series.getData().add(new Data<String, Number>(k.toString(), v));
		});
		
		chart.getData().add(series);
		
		chart.setLegendVisible(false);
		
		for(final Node node : chart.lookupAll(".default-color0.chart-bar")) {
			node.setStyle("-fx-bar-fill: green;");
		}
		
		return chart;
		
	}
	
	public static void setHistogram(final Histogram<?> histogram) {
		Kata2.histogram = histogram;
	}

}
