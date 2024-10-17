package Inheritance;

public class Television extends ElectronicDevice
{

	int ScreenSize;
	String Display;
	
	Television(String DeviceName,int DeviceId,int ScreenSize,String Display)
	{
		super(DeviceName,DeviceId);
		this.ScreenSize=ScreenSize;
		this.Display=Display;
	}
}
