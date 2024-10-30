package Multithreading;


//finalize method unreferenced object ko delete kar degi
//finalize method bhi ek thread hai
//demon thread- main method khatam ho gai to deman thread bhi khatam ho jauegi(dono ka lifespan same hai)
//demon bolta hai main method jab tak alive hai tab tak hi chalega
//demon method start karne se pehle hi lhikhna hai
//demon method main method ko service deti hai
class T5 extends Thread
{

	public void run()
	{
		while(true)
		{
			System.out.println("************");
		}
	}
	
}

public class Example3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		T5 t5=new T5();
		t5.setDaemon(true);
		t5.start();
		
		Thread.sleep(5000);
	}

}
