package classesAndObjects;

public class StaticExample {

	public static void main(String[] args) {
		
		Employee.ceo="riya";
		Employee e1=new Employee(101,"chetan");
		Employee e2=new Employee(102,"shriya");
		
		
		System.out.println(e1.ceo);
		System.out.println(e2.ceo);
	}
	
}
