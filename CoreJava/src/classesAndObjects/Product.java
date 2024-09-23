package classesAndObjects;

public class Product {
	
	int productId;
	String productName;
	int productPrice;

	//product ke object ke liye method set karna method ka kam hi hai
	//void me sirf chije set hongi return me kuch expected nahi hai
	//this ke sath instance variable hi likhna hai
	//jo object call karta uska kam this ki vajah se hota hai
	//this har ek object ke details set karne hai
	//this matlab current object
	
	void setProductDetails(int productId, String productName,int productPrice)
	{
	    this.productId=productId;
	    this.productName=productName;
	    this.productPrice=productPrice;
	    
	    System.out.println(this.productId+" "+this.productName+" "+this.productPrice);
	    
	}
}
