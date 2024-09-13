import java.util.Scanner;
class dowhile2

{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char decision;
		do
		{
			System.out.println("Enter numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("addition is:"+(a+b));
			System.out.println("Do you want to continue??Y/N");
			decision=sc.next().charAt(0);
		}while(decision=='Y');
	}
}