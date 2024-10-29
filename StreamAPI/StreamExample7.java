package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample7 {
	
	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(12,79,67,45,98,34);
		List<Integer> numbers = Arrays.asList();
	
		Optional<Integer> first = numbers.stream().findFirst();
		System.out.println(first);
		
//		Integer integer = first.get();
//		System.out.println(integer);
		
		Integer i = first.orElseThrow(()->new RuntimeException("No element present"));
		System.out.println(i);
	}
}
