package ClassesAndObjects;

public class class2 {

	public static void main(String[] args) {
		
		Calculator c1=new Calculator();
		c1.a=10;
		c1.b=20;
		int sum=c1.add();
		System.out.println("addition is"+sum);
		
		Calculator c2=new Calculator();
		c2.a=40;
		c2.b=20;
		System.out.println(c2.sub());
		
		Calculator c3=new Calculator();
		c3.setvalue(120,20);
		System.out.println(c3.a);
		
	}

}
