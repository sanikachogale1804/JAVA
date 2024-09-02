import java.util.Scanner;
class p7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println(name);
		
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println(age);
		
		System.out.println("My name is:"+name+" and"+" My age is:"+age);
	}
}