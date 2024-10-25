package Encapsulation;

public class Product {

	private int id;
	private String name;
	//eclipse hume auto generate getter and setter deta hai (hum variable banaynge eclipse hume getter and setter banake denga)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Product() {
		super();
	}
	
	public String toString()
	{
		return this.id+" "+this.name;
	}
	
}
