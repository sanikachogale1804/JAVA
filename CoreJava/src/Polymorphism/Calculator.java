package Polymorphism;
//Polymorphism
//poly-many  morphism-forms
//ek method kya allag alag kam kar sakta hai vo hum dekhte hai
//polymorphism ke 2 types hote hai 1-method overloading 2-method overriding
//method overloading -apke method ka name same hoga but number of parameters or type of parameters will be different

public class Calculator {
	//add method ko overload kiya kuynki yaha add method ke 3 forms hai
	
     void add(int a,int b)
     {
    	 System.out.println(a+b);
     }

     void add(int a,int b,int c)
     {
    	 System.out.println(a+b+c);
     }
     
     void add(float a,float b)
     {
    	 System.out.println(a+b);
    	 
     }
     void add(float a,float b,int c)
     {
    	 System.out.println(a+b+c);
     }
     
     public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(2,3);
		c.add(3,7,9);
		//float value ke piche F likhna padta hai otherwise vo double consider karega
		c.add(3.4F,8.9F);
		c.add(2.3F,1.9F,6);
	}
}
