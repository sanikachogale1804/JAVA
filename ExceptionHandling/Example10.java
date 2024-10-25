package ExceptionHandling;
//if you want to create runtimeexception to runtimeexcpetion ko hi inherit karenge

public class Example10 {

	public static void checkAge(int age)
	{
		if(age<=18)
		{
			throw new InvalidAgeException("age is invalid");
		}
		else
		{
			System.out.println("Registration Successful");
		}
	}
	
	public static void main(String[] args) {
		
		checkAge(18);
		
	}
	
}
