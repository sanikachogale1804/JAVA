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
		for(int i=1;i<=10;i++)
		{
			System.out.println("*******************");
		}
	}
	
}

public class Example3 {
	
	public static void main(String[] args) {
		
		
		
	}

}
