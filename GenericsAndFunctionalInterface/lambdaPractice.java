package GenericsAndFunctionalInterface;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
		List<String> names=Arrays.asList("sanika","Akshata","sneha","riya","tushar");
		Collections.sort(names,(s1,s2)->s1.length()-s2.length());
		
	    System.out.println(names);
	}

	
}
