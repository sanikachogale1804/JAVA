package classesAndObjects;

public class staticpractice1 {
	
	public static void main(String[] args) {
		
		staticpractice.ceo="riya";
		staticpractice  s1=new staticpractice(101,"abc");
		staticpractice  s2=new staticpractice(102,"xyz");
		
		System.out.println(s1.ceo);
		System.out.println(s2.ceo);
		System.out.println(s1.empId);
		System.out.println(s1.empName);
	}

}
