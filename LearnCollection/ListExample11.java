package LearnCollection;

import java.util.Stack;

public class ListExample11 {

	public static void main(String[] args) {
		Stack<Integer> numbers=new Stack<Integer>();
		numbers.push(30);
		numbers.push(29);
		numbers.push(98);
		numbers.push(56);
		System.out.println(numbers);
		
		System.out.println(numbers.search(29));
		System.out.println("=================================");
		
		System.out.println(numbers.pop());
		System.out.println(numbers);
		System.out.println("=================================");
		for(Integer i:numbers)
		{
			System.out.println(i);
		}
		System.out.println(numbers.pop());
		System.out.println(numbers);
		System.out.println("=================================");
		System.out.println(numbers.peek());
		System.out.println(numbers);
		System.out.println("=================================");
		System.out.println(numbers.empty());
		numbers.push(30);
		System.out.println(numbers);
	}
	
}

