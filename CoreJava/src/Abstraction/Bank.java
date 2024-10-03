package Abstraction;

public interface Bank {
	
	void details();
    void address();
    
    default void methodOfBank()
    {
    	System.out.println("default method");
    }
    
    static void staticmethod()
    {
    	System.out.println("static method");
    }
}
