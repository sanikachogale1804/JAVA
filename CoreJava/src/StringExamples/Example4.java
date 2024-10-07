package StringExamples;

public class Example4 {

	public static void main(String[] args) {
		
		String s1="Hello";
		s1=s1.concat(" world");
		System.out.println(s1);
		System.out.println("==========================");
		String a="Hello";
		String b="HELLO";
		
		System.out.println(a.equalsIgnoreCase(b));
		
		String c=new String("Hello");
		String d=new String("HELLO");
		
		System.out.println(c.equalsIgnoreCase(d));
		
	}
	
}
