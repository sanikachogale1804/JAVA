package LearnCollection;

import java.util.PriorityQueue;

public class QueueExample {
	
	public static void main(String[] args) {
//		System.err.println("Hello");
		
//		Queue(interface):2 classes hume milte hai ,chije store hoti hai par line mai
//		Queue:PriorityQueue:jo sabse chota elemnt uski priority jyada(by default sari chije asc order me rehnge)
//		insertion order maintain rehega uski guarantee nahi par pehla element sabse chota rehega(agar aap remove karenge to shuffle hoga)
//		
		PriorityQueue<Integer> numbers=new PriorityQueue<Integer>((i1,i2)->i2-i1);
		
		for(int i=1;i<=20;i++)
		{
			numbers.add(i);
		}
		System.out.println(numbers);
		System.out.println("==============================");
		
//		poll matlab first element and pop matlab last element
		
		System.out.println(numbers.poll());
		System.out.println(numbers);
		
		System.out.println(numbers.poll());
		System.out.println(numbers);
		
//		PriorityQueue ke pass koi logic nahi hai object ko compare karne ka isliye comparator use kiya
//      linked list ke pass sabse jyada methods hai(double ended queue kuynki vo start or end dono taraf se elemnt nikal sakta hai)	
//		stack me last element dekha jata hai or queue mai first element
	}

}
