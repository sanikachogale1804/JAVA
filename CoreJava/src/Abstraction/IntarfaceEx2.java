package Abstraction;

public class IntarfaceEx2 {
	
	public static void main(String[] args) {
		//bank type ka variable uske child ko hold karne ki capacity rakhta hai
		//parent can hold object of child
//datatype  variable 
		Bank s=new SBI();
		s.details();
		Bank ic=new ICICI();
		ic.details();
		ic.address();
	}

}
