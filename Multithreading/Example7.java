package Multithreading;

public class Example7 {

	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		Thread t1=new Thread(()->{
			for(int i=1;i<=500;i++)
			{
				counter.increment();
			}
		});
		
		Thread t2=new Thread(()->{
			for(int i=1;i<=500;i++)
			{
				counter.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		//main method rukegi nahi t1 and t2 ka kam hone tak is liye pehle 0 print kiya
		System.out.println(counter.count);
	}
	
}
