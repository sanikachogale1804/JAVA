package Abstraction;

public class IntarfaceEx2 {
	
	public static void main(String[] args) {
		//bank type ka variable uske child ko hold karne ki capacity rakhta hai
		//parent can hold object of child
//datatype  variable 
		Bank s=new SBI();
		s.details();
		s.methodOfBank();
		Bank ic=new ICICI();
		ic.details();
		ic.address();
		ic.methodOfBank();
		Bank.staticmethod();  //static method ko hum class ke name ke through access kar sakte hai object ki jarurat nahi hai
		
		Bank axis=new Bank() {
			public void details()
			{
				System.out.println("AXIS bank");
			}
			
			public void address() {
				System.out.println("Address of AXIC Bank");
			};
		};
		axis.details();
		axis.address();
		
		Bank baroda=new Bank() {
			public void details()
			{
				System.out.println("Baroda bank");
			}
			
			public void address()
			{
				System.out.println("Address of Baroda Bank");
			}
		};
		
		baroda.details();
		
	}

}
