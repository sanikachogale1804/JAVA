package Abstraction;

abstract class Vehicle {
	abstract void start_engine();
	abstract void stop_engine();
}

class Car extends Vehicle
{
	void start_engine()
	{
		System.out.println("Engine started:");
	}
	
	void stop_engine()
	{
		System.out.println("Engine stopped");
	}
}

class Bike extends Vehicle
{
	void start_engine()
	{
		System.out.println("bike started:");
	}
	void stop_engine()
	{
		System.out.println("Engine stopped:");
	}
}


public class AbstractionExample4 {
	
	public static void main(String[] args) {
		
		new Car().start_engine();
		new Car().stop_engine();
	    Vehicle Bike=new Vehicle() {
	    	void start_engine()
	    	{
	    		System.out.println("Bike starteddd:");
	    	}
	    	
	    	void stop_engine()
	    	{
	    		System.out.println("Bike stopped:");
	    	}
	    };
		Bike.start_engine();
		Bike.stop_engine();
		
		Vehicle Truck=new Vehicle() {
			void start_engine()
			{
				System.out.println("Truck started:");
			}
			
			void stop_engine()
			{
				System.out.println("Truck stopped:");
			}
		};
		Truck.start_engine();
		Truck.stop_engine();
		
	}

}
