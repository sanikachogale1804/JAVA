package staticKeyword;

class Counter
{
	static int count;
	
	Counter()
	{
		count++;
		System.out.println(count);
		
	}
}
//static memory ek hi baar jagah lega 
public class CounterProgram {

	public static void main(String[] args) {
		
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		
	}
	
	
}
