package Abstraction;

@FunctionalInterface
interface I6
{
	void printname(String name);
}
@FunctionalInterface
interface I7
{
	int add(int a,int b);
}
@FunctionalInterface
interface I8
{
	int square(int n);
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
		
		I7 obj2=(a,b)->a+b;
	    int sum=obj2.add(12,20);
	    System.out.println(sum);
		System.out.println(obj2.add(160,10));
		
		I8 obj3=(n)->n*n;
		System.out.println(obj3.square(28));
	}

}
