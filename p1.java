class p1
{
	public static void main (String args[])
	{
		int i=100;
		
		//unary operators
		//unary operators ek hi operator ke sath deal karta hai
		// ++increment  --decrement
		
		i++;
		i++;
		i--;
		System.out.println(i++);
		
		int j=20;
		j--;
		j--;
		i++;
		System.out.println(j+i);
		
		//post increment me pehle value print hogi badme increment hoga(memory me store hoga)
		//pre increment me pehle increment hoga badme print karega
		// ++a pre increment
		// a++ post increment
		// --a pre decrement
		// a-- post decrement
		
		
		//+= addition assignment operator
		
		int c=4;
		int d=2;
		
		c+=d;  //c=c+d
		d+=c;  //d=d+c
		System.out.println(d);
		System.out.println(c);	
		
		int d=3;
		int c=2;
		//d-=3=d=d-3
		
	}
}
