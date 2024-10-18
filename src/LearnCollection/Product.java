package LearnCollection;

import java.util.Comparator;

//public class Product implements Comparable<Product>
public class Product implements Comparator<Product>{
	
	private int productId;
	private String productName;
	private int productPrice;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	/*@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		//compareTo method positive,negative and 0 pe chalta hai
		//agar minus karke positive aayega to elements change honge
		//return o.productPrice-this.productPrice;
		return this.productName.compareTo(o.productName);
	}*/
	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return 0;
	
	}
	
}
