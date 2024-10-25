package LearnCollection;

import java.util.ArrayList;

public class ListExample4 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList<>();
		list.add(56);
		list.add(78);
		list.add(true);
		list.add(45.90);
		list.add(null);
		System.out.println(list);
		
		for(Object a:list)
		{
			System.out.println(a);
		}
		System.out.println("==================");
		System.out.println(list.size());
		
		list.remove(1);
		System.out.println(list);
		
		list.remove(list.size()-1);
		System.out.println(list);
	
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(67);
		list2.add(56);
		list2.add(89);
		list2.add(35);
		System.out.println(list2);
		
		list.addAll(list2);
		System.out.println(list);
	}
	
}
