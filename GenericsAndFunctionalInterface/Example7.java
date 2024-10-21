package GenericsAndFunctionalInterface;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Example7 {

	public static void main(String[] args) {
		
		Consumer<Integer> product=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t*20/100);
			}
		};
		product.accept(70);
		
	}

}
