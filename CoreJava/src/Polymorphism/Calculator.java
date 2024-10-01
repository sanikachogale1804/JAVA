package Polymorphism;
//Polymorphism
//poly-many  morphism-forms
//ek method kya allag alag kam kar sakta hai vo hum dekhte hai
//polymorphism ke 2 types hote hai 1-method overloading 2-method overriding
//method overloading -apke method ka name same hoga but number of parameters or type of parameters will be different
//method overloading-compile time polymorphism hai

public class Calculator {
	//add method ko overload kiya kuynki yaha add method ke 4 forms hai
	
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
     
     void sub(int a,int b,int c)
     {
    	 System.out.println(a-b-c);
     }
     void sub(int a,float b,int c,float d)
     {
    	 System.out.println(a+b-c+d);
     }
     
     void mul(int a,int b,float c)
     {
    	 System.out.println(a*b*c);
     }
     void mul(float a,float b)
     {
    	 System.out.println(a*b);
     }
     
     public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(2,3);
		c.add(3,7,9);
		//float value ke piche F likhna padta hai otherwise vo double consider karega
		c.add(3.4F,8.9F);
		c.add(2.3F,1.9F,6);
		c.sub(10,8,9);
		c.sub(12,32.8F,2,4F);
		c.mul(10,20,30F);
		c.mul(20F,60F);
	
	}
}

//Method overriding-run time polymorphism matlab run karte samay usko samaj aayega
//Two different classes me
//same method name
//same number of parameters
//and same type of parameters
//real use of method overriding abstraction me hoga










