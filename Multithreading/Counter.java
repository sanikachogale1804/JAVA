package Multithreading;

public class Counter {

		//Synchronized-at a time only one thread(matlab ek thread ek hi time pe aayegi )
	
		int count=0;
		
        synchronized public void increment()
        {
        	this.count++;
        }

}
