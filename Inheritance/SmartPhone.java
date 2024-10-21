package Inheritance;

public class SmartPhone extends Phone{

	int batteryLife;
	
	SmartPhone(String DeviceName,int DeviceNo,String model,String PhoneName,int phoneNo,int batteryLife)
	{
		super(DeviceName,DeviceNo,model,PhoneName,phoneNo);
		this.batteryLife=batteryLife;
	}
	
	void setdetails()
	{
		System.out.println("details");
		System.out.println("batteryLife is:"+batteryLife+"hours");
	}
}
