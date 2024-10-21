package Abstraction;

@FunctionalInterface
interface Test
{
	boolean isEven(int n);
}

public class InterfaceEx5 {
	
	public static void main(String[] args) {
		//functional interface-a interface which has only one abstract method is called functional interface
		//()->  =lambda expression iske andar jo bhi likhoge vo interface ka implementation hoga
		//> is arrow ke aage ka sab implementation hoga
		//
		
		/*new Test() 
		{
            public boolean isEven(int n)
            {
            	return n%2==0;
            }
		};*/ //ye sab itna likhne ki jagah lambda expression se jaldi kam hoga 
		
		Test t1=(n)->n%2==0;
		boolean ans=t1.isEven(50);
		System.out.println(ans);
	}

}
