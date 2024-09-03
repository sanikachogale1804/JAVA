import java.util.*;
class IfElse
{
	public static void main (String args[])
	{		
	
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	 
		if(n%2==0)
		{
			System.out.println(n+" is Even");
		}
		else
		{
			System.out.println(n+" is Odd");
		}
		
		if(n%7==0)
		{
			System.out.println(n+" is multiple by 7");
		}
		else
		{
			System.out.println(n+" is not multiple by 7");
		}
	}
}