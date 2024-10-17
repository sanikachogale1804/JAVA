package LinkedAndArrayList;

import java.util.LinkedList;
import java.util.function.Predicate;

public class LinkedListExample4 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(21);
		list.add(67);
		list.add(35);
		list.add(25);
		System.out.println(list);
		
		Predicate<Integer> num=(n)->n%7==0;
		list.removeIf(num);
		System.out.println(list);
	}
	
}
