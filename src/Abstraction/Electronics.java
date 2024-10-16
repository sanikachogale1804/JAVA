package Abstraction;

abstract class Electronics {

	abstract void start();
	abstract void stop();
	
}

class TV extends Electronics{

	public void start() {
		System.out.println("start tv");
	};
	
	public void stop() {
		System.out.println("stopeed tv");
	};
	
}

class Mobile extends Electronics{
	
	public void start() {
		System.out.println("Mobile started");
	};
	
	public void stop() {
		System.out.println("Mobile stopped");
	};
}