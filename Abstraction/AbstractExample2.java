package Abstraction;

abstract class Product
{
	abstract void details();
}

class Mobile extends Product
{
	void details()
	{
		System.out.println("Mobile details:");
	}
}


public class AbstractExample2 {
	
	public static void main(String[] args) {
		
		new Mobile().details();
		//class ke andar class banaya par name nahi diya matlab anonyms class
		//anonyms inner class
		Product Laptop=new Product() {
			//ye object sirf isi ke liye implementation karega
			void details()
			{
				System.out.println("Laptop details:");
			}
		    };
		Laptop.details();
		
		Product HeadPhone=new Product() {
			void details()
			{
				System.out.println("HeadPhone details:");
			}
		};
		HeadPhone.details();
		
	}
	

}
