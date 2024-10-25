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
@FunctionalInterface
interface subnumbers
{
	int sub(int a,int b);
}
@FunctionalInterface
interface I9
{
	int square(int a);
}
@FunctionalInterface
interface I10
{
	int cube(int a);
}
@FunctionalInterface
interface I11
{
	boolean isEven(int a);
}
@FunctionalInterface
interface I12
{
	void checkEven(int a);
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
		int sum=num.add(20,50);
		System.out.println(sum);
		
		subnumbers numbers=(a,b)->a-b;
		int subtraction=numbers.sub(30,20);
		System.out.println(subtraction);
		
		I9 squ=(a)->a*a;
		System.out.println(squ.square(30));
		
		I10 printcube=(a)->a*a*a;
		System.out.println(printcube.cube(4));
		
		I11 checkNum=(a)->a%2==0;
		boolean check=checkNum.isEven(11);
		System.out.println(check);
		
		I12 even=(a)->System.out.println(a%2==0);
		even.checkEven(12);
	}
	
}




