package Multithreading;

public class Example6 {
	
	public static void main(String[] args) {
		Runnable r1=()->System.out.println("MultiThreading with lambda");
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2=()->System.out.println("Lambda expression");
		Thread t2=new Thread(r2);
		t2.start();
		
		System.out.println("===============================================");
		Thread t3=new Thread(()->System.out.println("lambda"));
		t3.start();
	}
}





