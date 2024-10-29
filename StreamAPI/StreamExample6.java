package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class StreamExample6 {
	
	public static void main(String[] args) {
		
	//	List<Integer> numbers = Arrays.asList(2,7,9,5);
		//list is a parent of ArrayList is liye ArrayList direct banaya
	    List<Integer> numbers=new ArrayList<Integer>();
		//reduce bhi stream ko belong karta hai
		//reduce apke list ko ek hi element me reduce karega
		Optional<Integer> reduce = numbers.stream().reduce((a,b)->a+b);
		System.out.println(reduce);
		
//		Optional<Integer> reduce2 = numbers.stream().reduce((a,b)->a*b);
//		System.out.println(reduce2);
		
		//reduce ka return type optional hai
		//jab hum empty list me stream lagate hai to nullpointerexception ata tha
		//in case list empty hai and uspe humne reduce lagaya to exception nahi aayega isike liye optional banaya(vo exception nahi dega)
		
//		Integer integer = reduce.get();
//		System.out.println(integer);
		//optional isliye banaya hai ki aap khud decide karo konsa exception aayega
//		Integer integer2 = reduce2.get();
//		System.out.println(integer2);
		//to give exception we use orElseThrow
		//get method ka implementation
		
		//RunTimeException object banaya kuynki supplier object chahiye tha isliye humne diya
//		orElseThrow bolega list empty hai to aap batao ki apko konsa exception chahiye
		Integer i = reduce.orElseThrow(()->new RuntimeException("List is empty"));
		System.out.println(i);
	}

}
