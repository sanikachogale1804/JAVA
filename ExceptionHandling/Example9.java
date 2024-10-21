package ExceptionHandling;
//throw :hum hamari marji se decide karenge ki kab exception aaye
//methods and keywords small letter se start hote hai and class name capital se start honge
//main method me throw nahi lhikhenge alag se method banaynge
public class Example9 {
	
	public static void throwException()
	{
		throw new NullPointerException("sanika");
	}

	public static void main(String[] args) {
	
		System.out.println("Hello");
		try {
			throwException();
		}catch(NullPointerException e)
		{
			System.out.println("exception handled");
		}
		
		System.out.println("Bye");
		
	}
	
}
