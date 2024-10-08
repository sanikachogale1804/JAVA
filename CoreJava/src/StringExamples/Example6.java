
package StringExamples;
//StringBuilder and StringBuffer:string ko jab mutable banana hai matlab change kar sakte hai
//StringBuilder ke object ke upar multithreding possible hoga StringBuffer ke upar multithreading allowed nahi hai
//builder is faster and buffer is lower
public class Example6 {

	public static void main(String[] args) {
		//yaha pe jo object hai vahi pe manupulation honge
		StringBuilder sb=new StringBuilder("Hello");
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		 //    start end  replace
		sb.replace(0,2,"******"); //2 is exclusive(2 is not included)
		System.out.println(sb);
		sb.append("World"); //append matlab ending me chijo ko jodna
		System.out.println(sb);
		//delete me hum batate hai starting and ending index
		sb.delete(0,7);
		System.out.println(sb);
	}
	
	
}
