package Multithreading;

class Thread1 implements Runnable
{
	@Override
	public void run() {
	   System.out.println("Thread 1");
	}
	
}

public class Example5 {
	
	public static void main(String[] args) {
		//we want start method or start method Thread ke pass hai is liye Thread ka object banaya
		Thread t1=new Thread(new Thread1());
		t1.start();
		
		
//        Runnable r1=new Runnable() {
//			public void run()
//			{
//				System.out.println("Anonymous Inner Class");
//			}
//		};
		
		Thread t2=new Thread(new Runnable() {
			public void run()
			{
				System.out.println("Anonymous Inner Class");
			}
		});
		t2.start();
		
		
	}

}