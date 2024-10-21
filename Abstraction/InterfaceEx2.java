package Abstraction;

public class InterfaceEx2 {

	public static void main(String[] args) {
		R r=new R();
		r.add(10,10);
		r.sub(20,10);
		int ans=r.square(6);
		System.out.println(ans);
	}
}
