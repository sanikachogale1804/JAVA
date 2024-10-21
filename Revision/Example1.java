package Revision;

//interface me hum rule banate agar koi class isko access karega to uske pass sab abstract method honge
//hum interface ka object directly nahi bana sakte
//interface ke andar jo bhi method hai vo public abstract honge

interface I2
{
	void apply();
}
public class Example1 {

	public static void main(String[] args) {
		
		//i object sirf apply method ke liya bana
		//abstract method main method ke bhahr call nahi karoge
		I2 i=new I2() {
			public void apply() {
				System.out.println("apply method");
			}	
		};
		i.apply(); 
	}
	
}
