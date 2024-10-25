package Abstraction;

public class A implements I1{
	
	public void display()
	{
		System.out.println("overridden method of A class");
	} 

	public void square(int n)
	{
		System.out.println(n*n);
	}
	
     public void subtraction(int a,int b)
     {
    	 System.out.println(a-b);
     }
}
