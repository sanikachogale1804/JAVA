package LearnCollection;

import java.util.PriorityQueue;

public class QueueExample2 {
	
	public static void main(String[] args) {
		PriorityQueue<Product> priorityqueue=new PriorityQueue<Product>((p1,p2)->p2.getProductPrice()-p1.getProductPrice());
		
//		PriorityQueue ke pass koi logic nahi hai object ko compare karne ka isliye comparator use kiya
//      linked list ke pass sabse jyada methods hai(double ended queue kuynki vo start or end dono taraf se elemnt nikal sakta hai)	
//		stack me last element dekha jata hai or queue mai first element
		priorityqueue.add(new Product(101,"mobile",50000));
		priorityqueue.add(new Product(102,"laptop",70000));
		priorityqueue.add(new Product(103,"headphone",9000));
		
		System.out.println(priorityqueue);
		
		System.out.println(priorityqueue.peek());
	}

}
