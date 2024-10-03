package Abstraction;
//inerface ke andar jitne bhi method honge vo by default public abstract method honge aapko implentation dena nahi hai
//with the halp of interfaces we can achieve 100 % abstraction
//interface ka object hum nahi bana sakte kuynki uske pass bhi implementation nahi hai
//we use implements for interface
//Interface ke andar default method allowed hai but when after java 8
public interface I1 {
//public abstract void display();   Internally ye store hoga
	void display();
    void square(int n);
    void subtraction(int a,int b);
    
    
}

