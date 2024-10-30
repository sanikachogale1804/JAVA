package Multithreading;

import javax.xml.stream.events.StartDocument;

class T6 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("*");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class T7 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("by-by");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class Example4 {
	
	public static void main(String[] args) {
		
		T6 t6=new T6();
		t6.start();
		
		T7 t7=new T7();
		t7.start();
	}

}
