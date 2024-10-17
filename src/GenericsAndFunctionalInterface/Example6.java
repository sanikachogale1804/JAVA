package GenericsAndFunctionalInterface;

import java.util.function.Consumer;

public class Example6 {

	public static void main(String[] args) {
		
		Consumer<Integer> Student=new Consumer<>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
			/*if(t>=35)
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
				
			}*/
			if(t>=75)
			{
				System.out.println("A grade");
			}
			else if(t>=75 || t<=50)
			{
				System.out.println("B grade");
			}
			else if(t>=50 || t<=35)
			{
				System.out.println("c grade");
			}
			else
			{
				System.out.println("fail");
			}	
		};
	
		
	};
	Student.accept(80);	
	}
}
