import java.util.*;
class ElseIfLadder
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Marathi 2:Hindi 3:English");
		int n=sc.nextInt();
		
		if(n==1)
		{
			System.out.println("Marathi Language selected");
		}
		else if(n==2)
		{
			System.out.println("Hindi Language selected");
		}
		else if(n==3)
		{
			System.out.println("English lanuadge selecte");
		}
		else
		{
			System.out.println("you have given invalid inputc");
		}
		
		
	}
}