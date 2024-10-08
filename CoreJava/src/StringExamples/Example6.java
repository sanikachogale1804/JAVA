
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
	}
	
	
}
