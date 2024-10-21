package GenericsAndFunctionalInterface;

public class Example2 {

	public static void main(String[] args) {
		
	//   Autoboxing(primitive to wrapper conversion apne aap hota hai)
		int i=5;   //primitive data type
		Integer j=i; //wrapper class me convert kiya(AutoBoxing)
		System.out.println(j);  //isiko ko autoboxing bolte hai(java ne khud se hi conversation kiya)
		
		char ch='t';
		Character charr=ch;
		System.out.println(charr);
		
	//   Unboxing(wrapper to primitive conversion )	
		
	     Character c='a';//wrapper class
	     char d=c;//primitive data type
	     System.out.println(d);//convesion of wrapper to primitive or isiko unboxing bolenge
		
	}
	
}
