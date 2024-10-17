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
		System.out.println("sanika".charAt(2));   //index diya fir character mila
		
		System.out.println("===========================");
		System.out.println("apple".indexOf('p',3)); //3 rd index se chalu karenge
		System.out.println("laptop".indexOf('p',4));
		//stsrtswith to check the jo aap ne mention kiya hai string woh usi se start hua hai ki nahi
		System.out.println("Laptop".startsWith("L"));
		
		//to charArray matlab string chaaracter array me convert karti hai
		//charAt() for loop ke liye use karenge and tocharArray() enhanced loop se chalaynge
		String s2="bootle";
		char arr[]=s2.toCharArray();
		for(char ch:arr)
		{
			System.out.println(ch);
		}
		
		
	}
	
}
