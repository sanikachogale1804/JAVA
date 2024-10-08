package StringExamples;

public class Example4 {

	public static void main(String[] args) {
		
		String s1="Hello";
		s1=s1.concat(" world");
		System.out.println(s1);
		System.out.println("==========================");
		
		//trim is method which removes starting and ending space ,beech ka space nahi niklega
		
		System.out.println("He         l l          o         ".trim()+"wolrd");
		System.out.println("sanika".length());
		System.out.println("sanika".charAt(1));
	}
	
}
