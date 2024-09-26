package Inheritance;

class P
{
	void methodP()
	{
		System.out.println("Method of P class");
	}
}

class Q extends P
{
	void methodQ() 
	{
		System.out.println("Mathos of Q class");
	}
}

class R extends Q
{
	void methodR()
	{
		System.out.println("method of R class");
	}
}
class S extends R
{
	void methodS()
	{
		System.out.println("method of S class");
	}
}

public class MultilevelnheritanceEx {
	
	public static void main(String[] args) {
		
		S s1=new S();
		s1.methodP();
		s1.methodQ();
		s1.methodR();
		s1.methodS();
		
		Q q1=new Q();
		q1.methodP();
		q1.methodQ();
		
	}

}
