package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,78,89,67,56,45);
		list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
	}
}
