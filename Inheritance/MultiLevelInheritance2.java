package Inheritance;

public class MultiLevelInheritance2 {
	
	public static void main(String[] args) {
		
		SmartPhone sp=new SmartPhone("Mobile",102,"One Plus","OnePlus 9",12345671,14);
		System.out.println(sp.DeviceName);
		System.out.println(sp.model);
		System.out.println(sp.phoneNo);
		
		sp.MakeCall();
		sp.setdetails();
		
	}

}
