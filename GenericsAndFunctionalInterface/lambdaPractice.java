package GenericsAndFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

@FunctionalInterface
interface A
{
	void display();
	
}

class B implements A
{
	public void display()
	{
		System.out.println("b class");
	}
	
	public int square(int a,int b)
	{
		return a*b;
	}
}


public class lambdaPractice {

	public static void main(String[] args) {
//		List<Integer> numbers=Arrays.asList(10,70,67,54,97,69,45,29,35,19);
//		numbers.stream().forEach((n)->System.out.println(n%2==0));
		
		B b1=new B();
		b1.display();
        b1.square(10, 10);
	}
	
}
