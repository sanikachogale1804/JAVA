package Multithreading;

class T1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("sanika");
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
		}
	}
}

public class Example1 {
	
	public static void main(String[] args) {
		
		//first create a classs then inherit Thread
		//thread ek hi baar kam karti hai kuynki uske baad vo dead ho jayegi
		T1 t1 = new T1();
		t1.start();//start() method internally run() method ko call karega
		
		T2 t2 = new T2();
		t2.start();
		
		
	}

}
