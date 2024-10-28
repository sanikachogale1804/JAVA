package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		//jis bhi method ka return type void hota hai usko koi method nahi aaply kar sakte
		numbers.stream().filter(n->n>20).forEach(n->System.out.println(n));
		
	}

}
