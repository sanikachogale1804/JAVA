class Product
{   //instance variable
	int productId;
	String productName;
	int price;
	
	void productDetails()
	{
		System.out.println("Product details");
		System.out.println(productId+" "+productName+" "+price+" ");
	}
	
	void productInfo()
	{
		System.out.println("Product Info");
	}
}


class p20
{
	public static void main(String args[])
	{ 
//datatype  variable    object
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		
		p1.productId=1;
		p1.productName="Mobile";
		p1.price=20000;
		p2.productId=2;
		p2.productName="Laptop";
		p2.price=40000;
		p3.productId=3;
		p3.productName="Tv";
		p3.price=80000;
		
		System.out.println(p1.productId);
		System.out.println(p1.productName);
		System.out.println(p1.price);
		System.out.println(p2.productId);
		System.out.println(p2.productName);
		System.out.println(p2.price);
		System.out.println(p3.productId);
		System.out.println(p3.productName);
		System.out.println(p3.price);
		
		p1.productDetails();
		
		//p1.productInfo();
	}
	
}