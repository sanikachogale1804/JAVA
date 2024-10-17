package LinkedAndArrayList;

import java.util.LinkedList;
import java.util.function.Predicate;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(76);
		list.add(45);
		list.add(98);
		System.out.println(list);
		System.out.println("=================");
		for(Integer i:list)
		{
			System.out.println(i);
		}
		System.out.println("=================");
		list.add(0,34);
		System.out.println(list);
		Integer i=list.get(2);
		System.out.println(i);
		list.set(0,59);
		System.out.println(list);
		System.out.println("=================");
		Predicate<Integer> even=(num)->num%2==0;
		list.removeIf(even);
		System.out.println(list);
		
	}
	
	
}
