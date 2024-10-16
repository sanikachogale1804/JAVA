package Practice;

import java.util.function.Consumer;

public class genericExample1 {

	public static void main(String[] args) {
		Consumer<Integer> table=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				for(int i=1;i<=10;i++)
				{
					System.out.println(t*i);
				}
			}
		};
		table.accept(8);
		
	}
	
}
