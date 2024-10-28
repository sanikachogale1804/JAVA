package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample7 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,79,67,45,98,34);
		Function<Integer, Integer> squarefunction=n->n*n;
		List<Integer> square = numbers.stream().map(squarefunction).collect(Collectors.toList());
		System.out.println(square);
	}

}
