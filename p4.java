import java.util.Scanner;
class p4
{
	public static void main(String args[])
	{
		//sc is object and scanner is class
		//scanner ke pass sab functions hai is liye scanner ka object banaya
		Scanner sc=new Scanner(System.in);//scanner ko batana padta hai chije kaha se read karni hai is liye(System.in) use kiya
		System.out.println("Enter two numbers:");
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		System.out.println(n1+n2);
		
		System.out.println("Enter number:");
		int square=sc.nextInt();
		System.out.println(square*square);
		
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		System.out.println(length*breadth);
		
	}
}