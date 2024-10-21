package Encapsulation;

public class ECP1 {

	public static void main(String[] args) {
		Student s1=new Student(0, null, 0);
		s1.setId(101);
	  //System.out.println(s1.getId());
	//  int Id=s1.getId();
	//	System.out.println(id);
		int id=s1.getId("u#1");
		System.out.println(id);
		s1.setName("sanika");
		//System.out.println(s1.getName());
		String s=s1.getName();
		System.out.println(s);
		
		Student s2=new Student(id, s, id);
		s2.setAge(20);
		//System.out.println(s2.getAge());
		int age=s2.getAge();
		System.out.println(s2.getAge());
		
		System.out.println(s1);
	}
	
}
