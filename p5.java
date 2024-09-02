import java.util.Scanner;
class p5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		//sc.next()ye bas input leta hai variable me store nahi karega
		
		System.out.println("Enter first name:");
		String firstname=sc.next();
		System.out.println("My name is "+firstname);
	}
}