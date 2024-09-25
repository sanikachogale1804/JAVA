package Inheritance;

class A
{
	int add(int a,int b)
	{
		return a+b;
	}
	
	A()
	{
		System.out.println("constructor A");
	}
	A(String value)
	{
		System.out.println("parameterized constructor(A):"+value);
	}
	
}
class B extends A
{
	int sub(int a,int b)
	{
		return a-b;
	}
	B()
	{
		System.out.println("constructor B");
	}
	B(String value)
	{
		super(value);
		System.out.println("parameterized constructor(B):"+value);
	
	}
}


public class SingleInheritance {
	//inheritance is used to borrow properties for another class
	//single inheritance(parent and child)
	//inheritance me method bhi milega or constructor bhi milega
	//void ko hum sysout me nahi likhenge kuynki vo kuch return hi nahi kari
	//child ka object banaya to parent constructor ko bhi call karega
	//super matlab parent
    //super apko help karta parent ke parametterized constructor call ho
	//parent constructor ko koi value pohchani hai to super keyword use karenge 
	//bydefault child ka constructor parent ke non-parameterized constructor ko call karta hai
	
   public static void main(String[] args) {
	   
	   B obj=new B("sanika");
	   System.out.println("=============================");
	   int sum=obj.add(10,20);
	   System.out.println("sum is:"+sum);
	   
	   System.out.println(obj.sub(20,10));
	   
}
	
}
