package LearnCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample4 {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,89,67,34,68,43);
	//	predicate ka type integer hoga
		Stream<Integer> even = list.stream().filter(n->n%2==0);
	    even.forEach((n)->System.out.println(n));
		
	}

}
