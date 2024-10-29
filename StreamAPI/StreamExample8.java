package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StreamExample8 {
	
	public static void main(String[] args) {
		
//		List<Integer> numbers = Arrays.asList(12,79,67,45,98,34);
		List<Integer> numbers=new ArrayList<Integer>();
		Optional<Integer> first = numbers.stream().findFirst();
		//opional ek object hai to hum uspe kuch operation perform nahi kar sakte(matlab addition,subtraction) is liye hum get() ya orElsethrow method use kiye
//		agar stream empty hai to pehle bhohot sare exception aate the is liye optional class banaya
//		in case list empty hai to vo optional.empty dega is liye java ne optional banaya
		
		System.out.println(first);
		Integer integer = first.get();
		System.out.println(integer);
//		mai jo bolungi vahi exception chahiye to isme get method help nahi kar payega is liye orelsethrow method help kerega hume
//		supplier ke pass get method hai is liye lambda get method ka banayenge
//	orElseThrow ka return type integer hai
		Integer i = first.
		orElseThrow(()->new ArithmeticException("list is empty"));
		
		System.out.println(i);
		
		
	}

}
