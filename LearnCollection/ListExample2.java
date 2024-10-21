package LearnCollection;
import java.util.ArrayList;

public class ListExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(78);//0 index
		list.add(78);//1 index
		list.add(89);//2 index
		list.add(56);//3 index
		list.add(32);
		
		System.out.println(list);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
		System.out.println("===================");
		System.out.println(list.size());
		
		list.remove(2);
		System.out.println(list);
		
		list.remove(list.size()-1);
		System.out.println(list);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(101);
		list2.add(102);
		list2.add(103);
		
		list.addAll(list2);
		System.out.println(list);
		
		list.removeAll(list2);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}
	
}
