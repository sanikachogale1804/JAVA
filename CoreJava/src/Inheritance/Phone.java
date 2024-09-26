package Inheritance;

public class Phone extends Device {
	
	String PhoneName;
	int phoneNo;
	
	Phone(String DeviceName,int DeviceNo,String model,String PhoneName,int phoneNo)
	{
		super(DeviceName,DeviceNo,model);
		this.PhoneName=PhoneName;
		this.phoneNo=phoneNo;
	}
	
	void MakeCall()
	{
		System.out.println("making a call");
	}

}
