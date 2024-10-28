package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamExample6 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,7,9,5);
		//reduce bhi stream ko belong karta hai
		
		Optional<Integer> reduce = numbers.stream().reduce((a,b)->a+b);
		System.out.println(reduce);
	}

}
