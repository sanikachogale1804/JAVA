package staticKeyword;

class Counter
{
	static int count;
	
	Counter()
	{
		count++;
		System.out.println("count: "+count);
		
	}
}
//static memory ek hi baar jagah lega 
public class CounterProgram {

	public static void main(String[] args) {
		
		/*new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();*/
		for (int i=1;i<=100;i++)
		{
			new Counter();
		}
	}
	
	
}
