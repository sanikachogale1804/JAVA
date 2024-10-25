package classesAndObjects;

public class Practice {
	
	void isEven(int num)
	{
	   if(num%2==0)
	   {
		   System.out.println("even");
	   }
	   else
	   {
		   System.out.println("odd");
	   }
		
	}
	
	void isPrime(int number)
	{
		if(number%2==1)
		{
			System.out.println("Prime number:"+number);
		}
		else
		{
			System.out.println("Not a prime number:"+number);
		}
	}
	
	void table(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			
		}
			
	}
	
	void factorial(int fact)
	{
		for(int i=1;i<=fact;i++)
		{
			System.out.println(fact*=i);
			
		}
	}
	
	
	
	}



