package LearnCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

//LinkedHashSet bolta hai insertion order maintain rehta hai
//it will have only unique values and null values are allowed


public class SetExample3 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(11);
		set.add(34);
		set.add(11);
		set.add(29);
		
		System.out.println(set.size());
		System.out.println("==============================");
		//one by one elements lene hai to iterator use karenge
		//set ke andar jyada remove operation hore hai to iterator use karenge
		Iterator<Integer> iterator = set.iterator();  //iterator method returning you another object
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(set.isEmpty());
	}
	
}
