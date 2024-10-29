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
		
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=1;i<=100;i++)
		{
			numbers.add(i);
		}
		System.out.println(numbers);
		
		Optional<Integer> any = numbers.parallelStream().findAny();
		System.out.println(any);
		
		boolean anyMatch = numbers.stream().anyMatch((n)->n>10);
		System.out.println(anyMatch);
		
		boolean allMatch = numbers.stream().allMatch((n)->n>10);
		System.out.println(allMatch);
		
		boolean allMatch2 = numbers.stream().allMatch((n)->n%2==0);
		System.out.println(allMatch2);
		
		boolean anyMatch2 = numbers.stream().anyMatch((n)->n%2==0);
		
	}
}
