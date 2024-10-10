package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		try
		{
			int n=sc.nextInt();
		}catch(InputMismatchException exc)
		{
			System.out.println("Invalid Input");
		}
		
		
		System.out.println("code after exception");
	}
	
}
