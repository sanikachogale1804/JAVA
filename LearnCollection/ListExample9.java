package LearnCollection;

import java.util.Stack;

public class ListExample9 {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		//System.out.println(stack.empty());
		stack.push(20);
		stack.push(45);
		stack.push(67);
		stack.push(67);
		stack.push(56);
		System.out.println(stack);
		System.out.println("=====================");
		System.out.println(stack.search(56));
		System.out.println("=====================");
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println("=====================");
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.empty());
	}
	
}
