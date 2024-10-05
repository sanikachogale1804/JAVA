package Abstraction;
@FunctionalInterface
interface Practice
{
	void printNum(int n);
}
@FunctionalInterface
interface Practice1
{
	void printName(String name);
}
@FunctionalInterface
interface addnumbers
{
	int add(int a,int b);
}
public class InterfaceEx7 {

	public static void main(String[] args) {
		
		/*Practice p=new Practice() {
			public void printNum(int n)
			{
				System.out.println(n);
			}
		};
		
		p.printNum(12);*/
		
		Practice p=(n)->System.out.println(n);
		p.printNum(12);
	
		/*new Pracice1() 
		{
			public void printName(String name)
			{
				System.out.println("sanika");
			}
		};*/
		
		Practice1 p1=(name)->System.out.println("my name is:"+name);
		p1.printName("sanika");
		
		addnumbers num=(a,b)->a+b;
		int sum=num.add(10,20);
		System.out.println(sum);
		
	}
	
}
