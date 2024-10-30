package Multithreading;

class T1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("sanika");
			//thread class hai and sleep method static hai(matlab hum class ke through bhi access kar sakte hai)
			try {
				Thread.sleep(1000);//1000 matlab 1 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class T2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("by-by");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Example1 {
	
	public static void main(String[] args) {
		
		//first create a classs then inherit Thread
		//thread ek hi baar kam karti hai kuynki uske baad vo dead ho jayegi
		//thraed has a capability to stop your program matlab thread thode time tak kam rok dega(thread thode time ke liye so jayega)
		//main method bhi ek thread hai
		T1 t1 = new T1();
		t1.start();//start() method internally run() method ko call karega
		
		T2 t2 = new T2();
		t2.start();
		
		System.out.println("main method");
	}

}
