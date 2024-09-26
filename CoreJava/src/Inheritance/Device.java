package Inheritance;

public class Device {
	
	String DeviceName;
	int DeviceNo;
	String model;
	Device()
	{
		
	}
	
	Device(String DeviceName,int DeviceNo,String model)
	{
		this.DeviceName=DeviceName;
		this.DeviceNo=DeviceNo;
		this.model=model;
	}
	
	void PowerOn()
	{
		System.out.println("Device is powered on:");
	}
	

}
