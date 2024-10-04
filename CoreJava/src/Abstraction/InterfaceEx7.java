package Abstraction;
@FunctionalInterface
interface Practice
{
	void printNum(int n);
}

public class InterfaceEx7 {

	public static void main(String[] args) {
		
		Practice p=new Practice() {
			public void printNum(int n)
			{
				System.out.println(n);
			}
		};
		
		p.printNum(12);
		
		/*Practice p=(n)->System.out.println( n);
		p.printNum(12);*/
		
	}
	
}
