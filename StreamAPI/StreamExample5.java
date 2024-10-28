package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample5 {
	
	public static void main(String[] args) {
		//map stream ko belong karta hai
		//har object ke upar kuch kuch na preform karna hai to map use karenge kuynki actions should be prformed each object
		//map return me value dega foreach return me nahi dega
		
		List<Integer> numbers = Arrays.asList(12,79,67,34,90,13);
		Function<Integer, Integer> squarefunction=(n)->n*n;
		List<Integer> square = numbers.stream().map(squarefunction).collect(Collectors.toList());
		//function ka return type aap batate ho
		//map ko functions ka object chahiye
		//foreach ka return type void tha and map ka retrun type stream hai
		//dono alag alag interface accept karte hai
		System.out.println(square);
		
		
	    List<Integer> multiply10 = numbers.stream().map(n->n*10).collect(Collectors.toList());
		System.out.println(multiply10);
		
		
	}

}
