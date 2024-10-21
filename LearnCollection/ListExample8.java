package LearnCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ListExample8 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(67);
		list.add(89);
		list.add(35);
		list.add(12);
		System.out.println(list);
		
		Iterator<Integer>iterator=list.iterator();
		/*System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());*/
		/*try {
			System.out.println(iterator.next());
		}catch(NoSuchElementException e)
		{
			System.out.println("no elemnts");
		}*/
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
	
}
