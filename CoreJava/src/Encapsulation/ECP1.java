package Encapsulation;

public class ECP1 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(101);
	  //System.out.println(s1.getId());
		int Id=s1.getId();
		System.out.println(Id);
		s1.setname("sanika");
		//System.out.println(s1.getname());
		String s=s1.getname();
		System.out.println(s);
	}
	
}
