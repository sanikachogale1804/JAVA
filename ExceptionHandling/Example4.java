package ExceptionHandling;

public class Example4 {

	public static void main(String[] args) {
		
		String s="Laptop";
		try {
			System.out.println(s.charAt(20));
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("code after exception");
	}
	
}
