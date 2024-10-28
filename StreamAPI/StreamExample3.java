package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample3 {
	
	public static void main(String[] args) {
		
		//filter true or false ke sath hi deal karta hai
		//foreach ke time hum void method use kiye
		
		List<Integer> numbers=Arrays.asList(12,79,56,90,63,39);
		//filter belongs to stream 
		//stream ka type agar integer hai to predicate ka type hi integer hoga and test method ka bhi
		//filter ka return type stream hai
		//foreach filter ne return kiye hue stream pe lagaya hai
		//n->n>20=test method ka implementation
		//filter ko bola greater than number chahiye and foreach ko bola vo print karo
		//filter true ya false me ans dega(filter bas check karne ka kam karega)
		//jis bhi method ka return type void hota hai usko koi method nahi aaply kar sakte
		//numbers.stream() stream ka object milta hai matlab new stream milti hai and uske upar filter lagaya
		numbers.stream().filter(n->n>20).forEach(n->System.out.println(n));
		
		//collect method ka kam hai apko return me kya chahiye (set,list)
		//collect method ka kam hai stream ke andar ke ek ek element ko print karna or usko list dena
		//collect collector ka object demand karta hai
		//collectors(class) ka return type collector hai
		//without instanse variable usko static bolte hai
		System.out.println("=======================");
		//Collectors.toList(); giving me collector ka object
		//collectors class ki tolist method collect ka object deri hai
		//agar naya list  ya set chahiye to to collect use karenge
	    //Collector<Object, ?, List<Object>> list = Collectors.toList();
		List<Integer> greaterthan20 = numbers.stream().filter(n->n>20).collect(Collectors.toList());
		System.out.println(greaterthan20);
		//filter kuch specific element pe kam karta hai
		List<String> names = Arrays.asList("nisha","riya","sanika","neha","nikita");
		//collect ko collector ka object hai hamare pass collector ka object nahi hai to collectors claas hame help karega
		List<String> namesstartwithn = names.stream().filter(name->name.startsWith("n")).collect(Collectors.toList());
		System.out.println(namesstartwithn);
	}

}
