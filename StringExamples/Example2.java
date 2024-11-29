package StringExamples;
//equals matlab use karna hai to check equality == ye operator use nahi karna 
//equals method belongs to string class
//compare to return me integer dega boolean nahi
//String1>String2    +ve
//String1<String2    -ve
//String1==String2   0
public class Example2 {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="HELLO";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals("Hello"));
		System.out.println(a.equals("HELLO"));
		
        System.out.println("===============================");
		//equals ignore case : case ko ignore karta hai matlab capital small dono chalega
        
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println("===============================");
        
        String c="A";
        String d="a";
        
        System.out.println(c.compareTo(d));
        System.out.println("===============================");
        
        String s="INDIA";
        System.out.println(s.toLowerCase());
        //s=s.toLowerCase();
        System.out.println(s);
        
        System.out.println("===================================");
        
        
	}	
}
