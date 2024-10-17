package LinkedAndArrayList;

public class Product {

	private int id;
	private String name;
	private int price;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setPrice() {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	Product()
	{
		
	}
	
	Product(int id,String name,int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
