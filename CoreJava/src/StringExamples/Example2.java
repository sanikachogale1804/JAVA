package StringExamples;
//equals matlab use karna hai to check equality == ye operator use nahi karna 
//equals method belongs to string class
public class Example2 {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="HELLO";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals("Hello"));
		System.out.println(a.equals("HELLO"));
	}
	
}
