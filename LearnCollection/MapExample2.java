package LearnCollection;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MapExample2 {

	public static void main(String[] args) {
//		hashmap not maintained insertion order ,linkedhashmap maintain insertion order
//		hashmap and linkedhashmap both have same properties(key will not duplicate,values can be duplicate)
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<String, String> phonenos=
		new LinkedHashMap<String, String>();
		
  	   phonenos.put("sanika","7239817731");
  	   phonenos.put("riya","8765490734");
  	   phonenos.put("tushar","7864390117");
  	   
  	   System.out.println(phonenos);
  	   
  	   String name=sc.next();
  	   if(phonenos.containsKey(name)) 
  	   {
  		   System.out.println("your phone no is present:"+phonenos.get(name));
  		   System.out.println("do you want to change it(Y/N)");
  		   char decision=sc.next().charAt(0);
  		   if(decision=='Y')
  		   {
  			   String newphoneno=sc.next();
  			   phonenos.put(name, newphoneno);  
  		   }
  		   else
  		   {
  			   System.out.println("Thank you");
  		   }
  	   }
  	   else {
  		   System.out.println("your phone no is not present,do you want to add");
  		   String newphoneno=sc.next();
  		   phonenos.put(name, newphoneno);
  	   }
  	   System.out.println(phonenos);
	}
}
