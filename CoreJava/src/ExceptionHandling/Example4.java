package ExceptionHandling;

public class Example4 {

	public static void main(String[] args) {
		
		String s="Laptop";
		try {
			s.charAt(80);
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Index out of bound");
		}
		System.out.println("code after exception");
	}
	
}
