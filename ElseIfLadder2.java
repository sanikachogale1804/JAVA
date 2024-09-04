import java.util.Scanner;
class ElseIfLadder2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("1:Add 2:Sub 3:Mul 4:Div");
		int decision=sc.nextInt();
		if(decision==1)
		{
			System.out.println(n1+n2);
		}
		else if(decision==2)
		{
			System.out.println(n1-n2);
		}
		else if(decision==3)
		{
			System.out.println(n1*n2);
		}
		else if(decision==4)
		{
			System.out.println(n1/n2);
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
}