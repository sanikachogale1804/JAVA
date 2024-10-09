package Encapsulation;

public class ECP1 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(101);
	  //System.out.println(s1.getId());
		int Id=s1.getId();
		System.out.println(Id);
		s1.setName("sanika");
		//System.out.println(s1.getName());
		String s=s1.getName();
		System.out.println(s);
		
		Student s2=new Student();
		s2.setAge(20);
		//System.out.println(s2.getAge());
		int age=s2.getAge();
		System.out.println(s2.getAge());
	}
	
}
