package kata2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Histogram<T> {
	
	private final T[] data;
	
	public Histogram(final T[] data) {
		this.data = data;
	}
	
	public Map<T, Integer> getHistogram() {
		return Arrays.stream(data)
				.collect(Collectors.toMap(e->e,e->1,Integer::sum));
		
	}

	public T[] getData() {
		return data;
	}
	
}
