package LearnCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class SetExample9 {
	
	public static void main(String[] args) {
	
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(10);
		set.add(78);
		set.add(10);
		set.add(45);
		set.add(900);
		set.add(2);
		System.out.println(set);
		
		System.out.println(set.size());
		System.out.println("===============");
		
		Iterator<Integer> iterator=set.iterator();
		System.out.println(set);
		
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
		System.out.println("===============");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(iterator);
		
}
}
