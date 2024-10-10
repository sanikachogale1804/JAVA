package ExceptionHandling;

public class Example7 {

	public static void main(String[] args) {
		System.out.println("Hello");
		try
		{
			System.out.println(6/0);
		}catch(ArithmeticException e)
		{
			System.out.println("number can not divide by 0");
		}
		System.out.println("code after exception");
	}
	
}
