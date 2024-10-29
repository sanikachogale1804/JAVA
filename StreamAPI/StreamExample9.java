package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class StreamExample9 {
	
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<Integer>();
		for(int i=1;i<=100;i++)
		{
			numbers.add(i);
		}
		System.out.println(numbers);
		
		Optional<Integer> any = numbers.parallelStream().findAny();
		System.out.println(any);
		
//		pipeline matlab one by one aata hai element
//		parellelpipeline matlab ek pipeline nahi bhohot jyada pipeline(data alag alag pipeline se milega)
//		findAny ek pipeline ke upar nahi kam karta 
//		parellelstream me sequence ka guarante nahi hai
//		map,filter sari chije parallel pe apply hogi par sequnce ka guarantee nahi hogi
		System.out.println("===================================");
		
		numbers.parallelStream().forEach((num)->System.out.println(num));
		System.out.println("===================================");
//      anymatch me me ek bhi match hai to true milega
		boolean evenMatch = numbers.stream().anyMatch((n)->n%2==0);
		System.out.println(evenMatch);
		
		boolean greterthan1000 = numbers.stream().anyMatch((n)->n>=1000);
		System.out.println(greterthan1000 );
//		allmatch me me sare element match honge to true milega 
		boolean allMatch = numbers.stream().allMatch((n)->n%2==0);
		System.out.println(allMatch);
//      vaha pe uspe koi match nahi mila to true dega agar ek bhi match mila to false	
		boolean noneMatch = numbers.stream().noneMatch((n)->n>=1000);
		System.out.println(noneMatch);
	}

}
