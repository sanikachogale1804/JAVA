package GenericsAndFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

@FunctionalInterface
interface i1
{
	void isEven();
}

public class lambdaPractice {

	public static void main(String[] args) {
		
	new i1() {
		public void isEven()
		{
			
		}
	};
	
		
	}
	
}
