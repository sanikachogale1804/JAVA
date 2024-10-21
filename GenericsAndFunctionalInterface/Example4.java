package GenericsAndFunctionalInterface;

import java.util.function.Consumer;

public class Example4 {
	
	public static void main(String[] args) {
		
		Consumer<Integer> square=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t*t);
			}	
		};
		square.accept(9);
		
	}

}

//Consumer 
//accept(4) //4 ka table print karo ya pattern banao
//accept(student obj)  marks ke bas pe bolna hai pass ya fail ya fir grade batao
//accept(product obj)  20% discount do
//Supplier





