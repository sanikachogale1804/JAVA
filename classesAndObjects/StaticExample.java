package classesAndObjects;

public class StaticExample {
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		
		Employee.ceo="riya";
		Employee.changeceo("Nisha");
		Employee e1=new Employee(101,"chetan");
		Employee e2=new Employee(102,"shriya");
		
		System.out.println(e1.ceo);
		System.out.println(e2.ceo);
		System.out.println(e1.empId);
		System.out.println(e1.empName);
	}
	
}
//inheritance is used to borrow properties for another class
//single inheritance(parent and child)
//inheritance me method bhi milega or constructor bhi milega

