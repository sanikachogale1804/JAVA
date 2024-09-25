package Inheritance;

public class Cars extends Vehicle {

	String carName;
	int carPrice;
    String carColor;
    
    Cars(int vehicleId,String vehicleName,String carName,int carPrice,String carColor)
    {
    	this.carName=carName;
    	this.carPrice=carPrice;
    	this.carColor=carColor;
    }
}
