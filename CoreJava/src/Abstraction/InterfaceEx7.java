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
	
		Practice1 p1=(name)->System.out.println(name);
		p1.printName("my name is sanika");
		
	}
	
}
