package Abstraction;

public class InterfaceEx4 {
	
	public static void main(String[] args) {
		Shape s=new Circle();
		s.area();
		Shape s1=new Ractangle();
		s1.area();
		Circle c=new Circle();
		c.display();
		Shape s2=new Ractangle();
		s2.display();
	}

}
