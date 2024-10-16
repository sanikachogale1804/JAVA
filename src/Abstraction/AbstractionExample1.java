package Abstraction;

public class AbstractionExample1 {

	public static void main(String[] args) {
		
		TV t=new TV();
		new TV().start();
		new TV().stop();
		//t.start();
		
		new Mobile().start();
		
		Electronics WashingMachine=new Electronics() {
		     void start() {
		    	 System.out.println("wm started");
		     }
			void stop() {
				System.out.println("wm stopped:");
			}
		};
		WashingMachine.start();
	}
	
	
}
