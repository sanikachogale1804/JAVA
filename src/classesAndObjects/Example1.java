package classesAndObjects;

public class Example1 {

	public static void main(String[] args) {
		Order o1= new Order();
		o1.OrderDetails(101,"T-shirt",500);
		
		System.out.println("you have to pay:"+o1.discount());
		
		Order o2=new Order();
		o2.OrderDetails(102,"watch",700);
		
		System.out.println("pay: "+o2.discount());
		
		
	}
}
