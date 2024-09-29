package Polymorphism;

public class calculatorpractice {

	void add(int a,int b)
	{
	System.out.println(a+b);
	}
	
	void add(float a,float b)
	{
		System.out.println(a+b+b);
	}
	
	void sub(float a,float b)
	{
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		 
		calculatorpractice cp=new calculatorpractice();
		cp.add(12,60);
		cp.add(30F,20F);
		cp.sub(50,20);
	}
	
}
