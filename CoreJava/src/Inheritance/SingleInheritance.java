package Inheritance;

class A
{
	int add(int a,int b)
	{
		return a+b;
	}
}
class B extends A
{
	int sub(int a,int b)
	{
		return a-b;
	}
}


public class SingleInheritance {
	//inheritance is used to borrow properties for another class
	//single inheritance(parent and child)
	//inheritance me method bhi milega or constructor bhi milega
	//void ko hum sysout me nahi likhenge kuynki vo kuch return hi nahi kari
   public static void main(String[] args) {
	   
	   B obj=new B();
	   int sum=obj.add(10,20);
	   System.out.println("sum is:"+sum);
	   
	   System.out.println(obj.sub(20,10));
	   
}
	
}
