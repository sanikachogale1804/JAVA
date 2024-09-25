package classesAndObjects;

public class Example {

	public static void main(String[] args) {
		
		//Product p1=new Product();
		//p1.setProductDetails(1,"laptop",50000);
		
		//System.out.println("you have to pay: "+p1.discount());
		
		//Product p2=new Product();
		//p2.setProductDetails(2,"mobile",70000);
		
		//System.out.println("pay: "+p2.discount());
		
		Product p3=new Product(3,"Tv");
		System.out.println(p3.productId);
		System.out.println(p3.productName);
		
	}
}
