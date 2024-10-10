package ExceptionHandling;

public class Example5 {

	public static void main(String[] args) {
		//finally block ke undar likha hua code compulsory execute hota hai
		//exception handle karo na karo finally block execute hoga
		//pura program finally block me nahi likhenge (file close karni rahegi ya or kuch or kam karna rahega to hi use karenge)
		try
		{
			System.out.println(5/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handlled");
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("code after execution");
		
	}
	
}
