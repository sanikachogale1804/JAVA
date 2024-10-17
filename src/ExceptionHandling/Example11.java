package ExceptionHandling;

public class Example11 {

	public static void checkNumber(int n) throws NegativeNumberException 
	{
		if(n>=0) 
		{
			System.out.println(n);
		}
		else
		{
			throw new NegativeNumberException("number is negative");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			checkNumber(-18);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
	
}
