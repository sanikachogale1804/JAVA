import java.util.Scanner;
class p8
//charAt matlab character at some index
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean subscribed=false;
		System.out.println("Do you want to subscribe??Y/N");
		char decision=sc.next().charAt(0);
		
		if(decision=='y' || decision=='Y')
		{
			subscribed=true;
		}
		System.out.println("Subscribed:"+subscribed);
		
		if(subscribed)
		{
			System.out.println("You are subscribed");
		}
		else
		{
			System.out.println("You are not subscribed");
		}
	}
	
	
	
}

