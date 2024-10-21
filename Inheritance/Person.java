package Inheritance;

public class Person {
	
	int Id;
	String name;
	
	Person(int Id,String name)
	{
		//parameter me hame value milti hai par hame unhe instance variable me store karna padta hai is liye this use karenge
		this.Id=Id;
		this.name=name;
	}

}
