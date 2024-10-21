package ExceptionHandling;
public class Example7 {

	public static void throwExcpetion()
	{
		throw new NullPointerException("sanika");
	}
	
	public static void throwExcpetion1()
	{
		throw new ArithmeticException();
	}
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		try {
			throwExcpetion();
		}catch(NullPointerException e) {
		
			System.out.println("Excpetion handled");
		}
		try {
			throwExcpetion1();	
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("bye");
		
		
	}
	
}
		
