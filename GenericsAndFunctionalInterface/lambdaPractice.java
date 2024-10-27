package GenericsAndFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

abstract class product
{
	abstract void details();
}
class mobile extends product
{
	void details()
	{
		System.out.println("Mobile");
	}
}
class Tv extends product
{
	void details()
	{
		System.out.println("Tv");
	}
}

public class lambdaPractice {

	public static void main(String[] args) {
		new mobile().details();
        new Tv().details();
        
        product wm=new product() {
        	void details()
        	{
        		System.out.println("Wm started");
        	}
        };
        wm.details();
	}
	
}
