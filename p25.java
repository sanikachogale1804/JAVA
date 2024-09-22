class A
{
	int id;
	String name;
}
class B
{
	int id; 
	String name;
}


class p25
{
	public static void main(String args[])
	{
		A a1=new A();
		a1.id=101;
		a1.name="iphone";
		
		System.out.println(a1.id);
		System.out.println(a1.name);
		
		B b1=new B();
		b1.id=102;
		b1.name="one plus";
		
		System.out.println(b1.id);
		System.out.println(b1.name);
	}
}