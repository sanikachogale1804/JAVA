package LearnCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample7 {

	public static void main(String[] args) {
		//asList will help you to create list
		List<Integer> numbers=Arrays.asList(78,98,35,76,13);
		System.out.println(numbers);
		
		Collections.sort(numbers);//Collection class ke sort method ne apke liye kam kiya
		System.out.println(numbers);
		
		System.out.println("smallest Elements:"+numbers.get(0));
		System.out.println("Larget element:"+numbers.get(numbers.size()-1));
	}
	
}
