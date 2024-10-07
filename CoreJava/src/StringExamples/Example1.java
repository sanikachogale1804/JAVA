package StringExamples;
//String:String is a class in java
//String a="Hello";        this is called string literal
//there are two methods for string 1:string literals 2:by using object
//object will be created in heap memory
//string constant pool memory management me help karta hai
//manupulation usi object me nahi honge new object me honge
//Strings are immultable matlab it cannot be changed
//jitne bhi unrefrenced object hai usko java nikal deta hai usko garbage collection bolte hai
//new keyword se hum object banaynge vo nahi dekhega hello present hai ki nahi par string literal check karega aur agar string present hai to vo vapas nahi banayega
//string equal operations se nahi hota

public class Example1 {

	public static void main(String[] args) {
		
//       ways to crerate string
//       1) By using string Literal 
		//created string constant pool
		//agar hello pehele se present hai to vahi pe refer karega
		String a="Hello";
		String c="Hello";
		
//      2) by using new keyword
		//created heap memory
		//heap memory me vo check nahi karega har baar naya object hi banayega
		String b=new String("Hello");
		String d=new String("Hello");
		
		System.out.println("===============================");
		//2 variables same object pe point karte hai ki nahi ye string dekhegi
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b==d);
		System.out.println(d==c);
		
		
	}
	
}
