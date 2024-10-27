package GenericsAndFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

abstract class animal
{
	abstract void makesound();
}

class dog extends animal
{
	void makesound()
	{
		System.out.println("bho - bho");
	};
}

public class lambdaPractice {

	public static void main(String[] args) {
		new dog().makesound();
        
	}
	
}
