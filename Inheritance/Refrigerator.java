package Inheritance;

public class Refrigerator extends ElectronicDevice{
	
	int temprature;

	Refrigerator(String DeviceName,int DeviceId,int temprature)
	{
		super(DeviceName,DeviceId);
		this.temprature=temprature;
	}
}
