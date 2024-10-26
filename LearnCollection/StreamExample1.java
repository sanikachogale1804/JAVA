package LearnCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arraylist= new ArrayList<Integer>();
		for(int i=1;i<=20;i++)
		{
			arraylist.add(i);
			
		}
		System.out.println(arraylist);
		System.out.println("=================================");
	//	apki list hi Integer hai is liye stream ka object milega'
	//	methods ko stream ka object hi call kar sakta hai
		Stream<Integer> stream=arraylist.stream();
	//	foreach   map    filter   reduce
	//	foreach consumer accpet kari hai
	//	stream consumer ke accept method se gujrega(acccept method ke andar number pass karne ka kam stream karega)
		//foreach method consumer ka object hi used karega
		//foreach method belong to stream class
		Consumer<Integer> c=(i)->System.out.println(i);
		//stream.forEach(c);
		
		List<String> names = Arrays.asList("Sanika","Pooja","Amit","Joel","Tushar");
		Stream<String> namesStream = names.stream();
		//Consumer<String> nameconsumer=(n)->System.out.println(n.charAt(0));
		Consumer<String> nameconsumer=(n)->System.out.println(n+" "+n.length());
	    namesStream.forEach(nameconsumer);
		//namesStream.forEach((n)->System.out.println(n));
		
	    
	}

}
