package GenericsAndFunctionalInterface;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import classesAndObjects.Array;

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
@FunctionalInterface
interface bignum
{
	public int checknum(int a,int b);
	
}

public class lambdaPractice {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("sanika","Akshata","sneha","riya","tushar");
		Collections.sort(names,(s1,s2)->s1.length()-s2.length());
		
	    System.out.println(names);
	    
	    Consumer<String> printconsumer=(s)->System.out.println(s);
	    printconsumer.accept("sanika");
	   
	    bignum posOrNeg=(num1,num2)->num1+num2;
	    System.out.println(posOrNeg.checknum(10, 20));
	  
	    List<String> names2=Arrays.asList("sanika","sneha","Akshata","riya","tushar");
	    
	   HashSet<Integer>i1= new HashSet<Integer>();
	   
	    
	}

	
}
