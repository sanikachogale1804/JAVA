package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Sanika","akshata","tushar","riya");
		Stream<String> stream = list.stream();
	}
	
}
