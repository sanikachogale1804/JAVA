class Calculator
{
	int a;
	int b;
	
	int addition()
	{
		return a+b;
	}
	int subtraction()
	{
		return a-b;
	}
	void setvalue(int n1,int n2)
	{
		a=n1;
		b=n2;
	}
	
}
//jab bhi koi return bolega matlab return me kya value expected hai hdegaum value change kar sakte hai 
//void me bas print karke dega

class p22
{
	public static void main(String args[])
	{
		Calculator c1=new Calculator();
		c1.a=30;
		c1.b=20;
	    int sum=c1.addition();
		System.out.println("addition is:"+sum);
	    System.out.println(sum>100);
		
		int sub=c1.subtraction();
		System.out.println("subtraction is:"+sub);
		//System.out.println(sub+10);
		
		Calculator c2= new Calculator();
		c2.setvalue(120,20);
		System.out.println(c2.a+ "   "+c2.b);

        Calculator c3=new Calculator();
		c3.setvalue(30,10);
		System.out.println(c3.a+ "   "+c3.b);
	}
}