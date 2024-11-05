package Multithreading;

public class Counter {

		//Synchronized-at a time only one thread
		int count=0;
		
        public void increment()
        {
        	this.count++;
        }

}
