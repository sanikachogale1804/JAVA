package Abstraction;

@FunctionalInterface
interface I6
{
	void printname(String name);
}

public class InterfaceEx6 {
	
	public static void main(String[] args) {
		
		//agar code ek line ka to sysout likh do or 2 se jyada line hai to curly braces me likho
		//obj is name of object and name is variable
		I6 obj=(name)->System.out.println("My name is: "+name);
		obj.printname("sanika");
		
		I6 obj1=(name)->{
			for(int i=1;i<=100;i++)
			{
				System.out.println(name);
			}
		};
		obj1.printname("riya");
		
	}

}
