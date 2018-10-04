package kata2;

import java.util.Map;

public class Kata2 {
	
	public static void main(String[] args) {
		
		final Integer[] data = {3,1,1,2,1,3};
		
		Histogram<Integer> histogram = new Histogram<>(data);
		
		final Map<Integer, Integer> results = histogram.getHistogram();
		
		results.forEach((k,v) -> System.out.println(k + "->" + v));
		
	}

}
