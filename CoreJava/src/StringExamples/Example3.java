package StringExamples;
import java.util.Scanner;
public class Example3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password:");
		String pass=sc.next();
		String password="X0123";
		
		if(pass.equals("X0123"))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("login unsucessful");
		}
	}
	
}
