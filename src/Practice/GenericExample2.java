package Practice;

import java.util.function.Consumer;

public class GenericExample2 {
	
	public static void main(String[] args) {
		Consumer<Student1> s=new Consumer<Student1>() {

			@Override
			public void accept(Student1 t) {
				// TODO Auto-generated method stub
				if(t.getMarks()>=75)
				{
					System.out.println("pass");
				}
				else
				{
					System.out.println("fail");
				}
			}	
		};
		s.setMarks(76);
	}

}
