package ExceptionHandling;
import java.util.InputMismatchException ;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter first number");
			int num1=sc.nextInt();
			System.out.println("Enter second number");
			int num2=sc.nextInt();
			
			System.out.println("Division is:"+(num1/num2));
			//one try can hav multiple catch block
		}catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
		}
		catch(ArithmeticException e)
		{
			System.out.println("You cannot divide number by 0");
		}
		System.out.println("code after exception");
	}
	
}
