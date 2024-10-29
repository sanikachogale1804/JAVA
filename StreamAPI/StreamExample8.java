package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,79,67,45,98,34);
		Optional<Integer> first = numbers.stream().findFirst();
		//opional ek object hai to hum uspe kuch operation perform nahi kar sakte(matlab addition,subtraction) is liye hum get() ya orElsethrow method use kiye
		System.out.println(first);
		Integer integer = first.get();
		System.out.println(integer);
	}

}
