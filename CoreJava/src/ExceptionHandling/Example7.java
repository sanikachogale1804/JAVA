package ExceptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Example7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println(num1/num2);
		}
		catch(InputMismatchException e)
		{
			System.out.println("invalid input");
		}
		catch(ArithmeticException e)
		{
			System.out.println("number cannot divide by 0");
		}
		
	}
	
}
