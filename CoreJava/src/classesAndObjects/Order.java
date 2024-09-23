package classesAndObjects;

public class Order {
	
	int orderId;
	String orderName;
	int orderPrice;

	void OrderDetails(int orderId,String orderName,int orderPrice)
	{
		this.orderId=orderId;
		this.orderName=orderName;
		this.orderPrice=orderPrice;
		
		System.out.println(this.orderId+" "+this.orderName+" "+this.orderPrice);
	}
}
