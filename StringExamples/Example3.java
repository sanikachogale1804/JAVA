package StringExamples;
import java.util.Scanner;
public class Example3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password:");
		String pass=sc.nextLine();
		String password="X0123";
		
	  //if(password.compareTo(pass)==0)
		if(password.equals(pass))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("login unsucessful");
		}
	}
	
}
