package StringExamples;

public class Example8 {

	public static void main(String[] args) {
		//trime method removes starting and ending space,bech ka space nahi niklega
		/*System.out.println("sa        n         i    ka        ".trim()+"chogale");
		System.out.println("====================");
		System.out.println("riya".length());
		System.out.println("====================");
		System.out.println("siddhesh".charAt(7));
		System.out.println("====================");
		System.out.println("siddhesh".indexOf('d',3));
		System.out.println("apple".indexOf('p',4));
		System.out.println("Laptop".indexOf('p',2));
		System.out.println("====================");
		System.out.println("Laptop".startsWith("La"));
		System.out.println("====================");
		String s2="sanika";
		char arr[]=s2.toCharArray();
		for(char ch:arr)
		{
			System.out.println(ch);
		}*/
		
		/*String s3="sneha";
		for(int i=(s3.length()-1);i>0;i++)
		{
			System.out.println(s3.charAt(i));
		}*/
		
		StringBuilder sb=new StringBuilder("sanika");
		sb.reverse();
	    System.out.println(sb);
	    sb.reverse();
	    System.out.println(sb);
	    sb.replace(0,3,"*******");
	    System.out.println(sb);
	    sb.append(" chogale");
	    System.out.println(sb);
	    StringBuilder sb1=new StringBuilder("suvarna");
	    sb1.delete(0,3);
	    System.out.println(sb1);
	    System.out.println("akshata".substring(2,4));
	}
	
}
