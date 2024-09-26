package Inheritance;

public class MultiLevelInheritance1 {
	
	public static void main(String[] args) {
		
		Person p=new Person(1,"sneha");
		System.out.println(p.name);
		SchoolPassOutPerson sp=new SchoolPassOutPerson(2,"akshata","ABAD");
		System.out.println(sp.SchoolCerttificateNo);
		CollegePassoutPerson cp=new CollegePassoutPerson(1,"sanika","abc","567");
		System.out.println(cp.SchoolCerttificateNo);
		System.out.println(cp.Id);
		
		
	}

}

//Hierarachical Inheritance
//one parent multiple children
//jab ek chij bhohot sare classes ko distribute karna hai to Hierarachical Inheritance use karenge
