package Abstraction;

abstract class product
{
	abstract void details();
}

class Mobile extends product
{
	void details()
	{
		System.out.println("Mobile details:");
	}
}

class Laptop extends product
{
	void details()
	{
		System.out.println("Laptop details:");
	}
}
public class AbstractExample2 {
	
	public static void main(String[] args) {
		
		new Mobile().details();
		new Laptop().details();
	}
	

}
