package ExceptionHandling;
//Exception Handling:
//program compile hote time beech me ruk jayega uske baad ka code execute nahi hoga
//run time exception matlab run hote hote hume samjega
//try matlab aaisa block jisme aap risky code lhikhoge
//risky code matlab in case future me exception aayeaga
//catch ka kam hai exception ka jo object throw hora hai to usko catch karna

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Hello");
		try
		{
			System.out.println(5/0);
		}catch(ArithmeticException e)   //e is a variable(apka object is variable me store hoga) name and ArithmeticException is readymade class created by java
		{
			System.out.println(e);
			//System.out.println("we can not divide number by zero");
		}
		System.out.println("code after exception");
	}
	
}
