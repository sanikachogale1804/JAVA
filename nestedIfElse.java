class nestedIfElse
{
	public static void main(String args[])
	{
		//if ke andar or ek if-else likhenege to usko nested if-else bolte hai
		int n=21;
		
		if(n%3==0)
		{
			System.out.println(n+" is multiple of 3");
			if(n%2==0)
			{
				System.out.println(n+" is Even");
			}
			else
			{
				System.out.println(n+" is Odd");
			}
		}
		else{
			System.out.println(n+" is not multiple of 3");
		}
	}
}