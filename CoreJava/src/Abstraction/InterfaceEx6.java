package Abstraction;

@FunctionalInterface
interface I6
{
	void printname(String name);
}

public class InterfaceEx6 {
	
	public static void main(String[] args) {
		
		//agar code ek line ka to sysout likh do or 2 se jyada line hai to curly braces me likho
		I6 obj=(name)->System.out.println("My name is: "+name);
		obj.printname("sanika");
		
	}

}
