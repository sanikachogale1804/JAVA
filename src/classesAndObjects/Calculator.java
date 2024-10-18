package ClassesAndObjects;

public class Calculator {

	int a;
	int b;
	public int add()
	{
		return a+b;
	}
	public int sub()
	{
		return a-b;
	}
	public void setvalue(int n1,int n2)
	{
		a=n1;
		b=n2;
		System.out.println("values");
	}
	
}
