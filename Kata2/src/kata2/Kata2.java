package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
	
	public static void main(String[] args) {
		
		final int[] data = {3,1,1,2,1,3};
		
		final Map<Integer, Integer> histogram = new HashMap<>();
		
		for(final int n : data) {
			
			if(histogram.containsKey(n)) {
				histogram.put(n ,histogram.get(n)+1);
			} else {
				histogram.put(n, 1);
			}
			
		}
		
		histogram.forEach((k, v) -> System.out.println(k+" -> "+v));
		
	}

}
