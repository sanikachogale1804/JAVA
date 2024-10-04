package Abstraction;
@FunctionalInterface
interface Practice
{
	void printNum(int n);
}

public class InterfaceEx7 {

	public static void main(String[] args) {
		
		/*I7 i=new I7() {
			public void printNum()
			{
				System.out.println("12,67");
			}
		};
		i.printNum();*/
		
		Practice p=(n)->System.out.println( n);
		p.printNum(12);
		
	}
	
}
