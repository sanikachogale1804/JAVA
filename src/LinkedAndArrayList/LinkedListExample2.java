package LinkedAndArrayList;

import java.util.LinkedList;
import java.util.function.Predicate;

public class LinkedListExample2 {

	public static void main(String[] args) {
	
		LinkedList<String> names=new LinkedList<String>();
		names.add("Sanika");
		names.add("riya");
		names.add("askhata");
		names.add("tushar");
		
		System.out.println(names);
		
		/*Predicate<String> n=(name)->name.startsWith("a");
		names.removeIf(n);
		System.out.println(names);*/
		
		Predicate<String> n=(name)->name.startsWith("r");
		names.removeIf(n);
		System.out.println(names);
	}

}
