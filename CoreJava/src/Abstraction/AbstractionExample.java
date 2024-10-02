package Abstraction;
//abstraction matlab aap assume kar rahe ho
//agar koi method likhi or uska implementation hai hi nahi to usko abstraction bolenge
//abstraction bolta hai method without implementation is called abstract method
//void add(int a,int b)      //abstract method 
//curly braces nahi diya matlab implementation nahi diya
//rule of abstraction
//apko abtract method lagana hai to abstract keyword lagana padega
//normal class can not have abstract method
//abstract class me normal method allowed hai par normal class me abstract method nahi allowed
//agar apne abstract class banaya hai to directly uska object nahi bana sakte because uske pass implementation nahi hai
//start method ka implementation provide karna padega and its compulsory
//override karna matlab same exact copy banana
//implementation nahi diya matlab curly braces nahi lagaya

abstract class Electronics{
	
	abstract void start();
	abstract void stop();
	
	
}

class TV extends Electronics  //tv me start method hona hi chahiye usko hi abstraction bolte hai matlab tv class ko compulsion hai
{
	void start()
	{
		System.out.println("Tv started:");
	}
	
	void stop()
	{
		System.out.println("Tv stopped:");
	}
}

class AC extends Electronics
{
	void start()
	{
		System.out.println("Ac started:");
	}
	
	void stop()
	{
		System.out.println("AC stopped:");
	}
}

public class AbstractionExample {
	
	public static void main(String[] args) {
		
		new TV().start();
		new AC().start();
		new TV().stop();
		new AC().stop();
		
		Electronics WashingMachine=new Electronics() {
			void start()
			{
				System.out.println("WashingMachine start:");
			}
			void stop()
			{
				System.out.println("WashingMachine stop:");
			}
		};
		WashingMachine.start();
		WashingMachine.stop();
		
	}

}
