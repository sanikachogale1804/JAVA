package GenericsAndFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

@FunctionalInterface
interface shape
{
	int square(int a,int b);
}

public class lambdaPractice {

	public static void main(String[] args) {
		shape squ=(a,b)->a*b;
		int ans=squ.square(10, 20);
        System.out.println(ans);
	}
	
}
