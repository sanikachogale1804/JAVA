package Interface;

interface I1{
	void display();
	void square(int n);
	int areaOfSquare(int l,int b);
}

public class A implements I1{

	public void display() {
		System.out.println("A details:");
	}
	public void square(int n)
	{
		System.out.println(n*n);
	}
	public int areaOfSquare(int l,int b)
	{
		return l*b;
	}
}
