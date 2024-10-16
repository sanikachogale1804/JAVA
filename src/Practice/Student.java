package Practice;


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s=new Student1(1,"Electronics");
		System.out.println(s.name);
		Student1 s2=new Student1();
		s2.setage(20);
		System.out.println(s2.getage());
		s2.setName("sanika");
		s2.getName();
	}

}
