package LearnCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ListExample10 {

	public static void main(String[] args) {
	
		HashSet<Integer> hashset=new HashSet<Integer>();
		hashset.add(30);
		hashset.add(30);
		hashset.add(56);
		hashset.add(90);
		hashset.add(89);
		hashset.add(null);
		
		System.out.println(hashset);
		
		List<Integer> list=Arrays.asList(12,20,20,78,98,98);
		System.out.println(list);
		
		HashSet<Integer> set=new HashSet<Integer>(list);
		System.out.println(set);
	}
	
}
