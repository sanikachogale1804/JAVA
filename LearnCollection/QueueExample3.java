package LearnCollection;

import java.util.LinkedList;

public class QueueExample3 {
	
	public static void main(String[] args) {
		LinkedList<Integer> numbers=new LinkedList<Integer>();
		numbers.addLast(12);  //addlast beheve like add method only(name se nahi jaynge kam se jayenge(last me add hoga aaisa kuch nahi kahi pe bhi add hoga))
		for(int i=1;i<=10;i++)
		{
			numbers.add(i);
		}
		
		numbers.addFirst(20);
		System.out.println(numbers);
		
		numbers.removeFirst();
		System.out.println(numbers);
		numbers.removeFirst();
		System.out.println(numbers);
		
		System.out.println(numbers.getFirst());
		System.out.println(numbers.getLast());
	}

}




