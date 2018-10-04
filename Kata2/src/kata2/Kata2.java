package kata2;

import java.util.Map;

public class Kata2 {
	
	public static void main(String[] args) {
		
		final String[] data = {"Java","C++","C#","Java","JavaScript","C#","Java",
				"Python","C++","C++","Ruby","JavaScript"};
		
		Histogram<String> histogram = new Histogram<>(data);
		
		final Map<String, Integer> results = histogram.getHistogram();
		
		results.forEach((k,v) -> System.out.println(k + "->" + v));
		
	}

}
