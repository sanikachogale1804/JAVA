package Inheritance;

public class HierarchicalInheritance1 {

	public static void main(String[] args) {
		
		Television T=new Television("Samsung",123,46,"abc");
		System.out.println(T.DeviceName);
		System.out.println(T.ScreenSize);
		
		Refrigerator R=new Refrigerator("Whirphool",672,38);
		System.out.println(R.DeviceName);
		System.out.println(R.temprature);
		
	}
}
