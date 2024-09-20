class Calculator
{
	int a;
	int b;
	
	int addition()
	{
		return a+b;
	}
	
}
//jab bhi koi return bolega matlab return me kya value expected hai hdegaum value change kar sakte hai 
//void me bas print karke dega

class p22
{
	public static void main(String args[])
	{
		Calculator c1=new Calculator();
		c1.a=12;
		c1.b=20;
	    int sum=c1.addition();
		System.out.println("addition is:"+sum);
	    System.out.println(sum>100);

	}
}