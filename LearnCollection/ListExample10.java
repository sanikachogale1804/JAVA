package LearnCollection;

import java.util.HashSet;

public class ListExample10 {

	public static void main(String[] args) {
	
		HashSet<Integer> hashset=new HashSet<Integer>();
		hashset.add(30);
		hashset.add(56);
		hashset.add(90);
		hashset.add(89);
		hashset.add(null);
		
		System.out.println(hashset);
	}
	
}
