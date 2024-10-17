package LearnCollection;
import java.util.ArrayList;

public class ListExample1 {

	public static void main(String[] args) {
		
		//bhohot sare operations ek sath perform karna hai to list use karenge
		//agar hum ArrayList ka type nahi dete to by default uska type object hota hai
		//add method is common for every collection interface and classes.
		//agar maine type nahi bataya to mai konsa bhi type add kar sakti hu matlab it can be stored any type of value in single ArrayList.
		ArrayList list=new ArrayList<>();  //list is a collection
		list.add("sanika");
		list.add(67);
		list.add(56.98);
		list.add(null);
		list.add(true);
		
		System.out.println(list);
		
		for(Object i:list)
		{
			System.out.println(i);
		}
	}
	
}
