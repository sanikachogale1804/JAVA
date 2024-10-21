package GenericsAndFunctionalInterface;

import java.util.function.Consumer;

public class Example5 {

	public static void main(String[] args) {
		
		Consumer<Integer> table=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
			/*for(int i=1;i<=10;i++)
			{
				System.out.println(t +"*"+""+i+" "+"="+(i*t));
			}*/
				
			}
		};
//		table.accept(6);
//		Consumer t1=(t)->{
//			for(int i=1;i<=10;i++)
//			{
//				t*i;
//			}
//		};
		
		
	}		
}
