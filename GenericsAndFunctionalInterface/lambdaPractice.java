package GenericsAndFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface math
{
	int square(int a,int b);
}

public class lambdaPractice {

	public static void main(String[] args) {
		
		//Predicate<Integer> math=new Predicate<Integer>();
				
		List<String> names=Arrays.asList("Sanika","Akshata","Joel","Tushar");
		names.stream();
	    Consumer<String> name=(n)->System.out.println(n);
	    
		math squ=(a,b)->a*b;
		System.out.println(squ.square(10, 20));
		
	}
	
}
