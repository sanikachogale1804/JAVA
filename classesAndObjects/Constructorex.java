package classesAndObjects;

public class Constructorex {

	public static void main(String[] args) {
		
		constructor c1=new constructor();//non-parameterized constructor
		
		constructor c2=new constructor(101,"electronics");//parameterized constructor
		System.out.println(c2.Id);
		System.out.println(c2.Name);
		
		constructor c3=new constructor("clothes",102);
		System.out.println(c3.Name);
		System.out.println(c3.Id);
		
		constructor c4=new constructor(103);
		System.out.println(c4.Id);
		
	}
	
}
