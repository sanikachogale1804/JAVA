package classesAndObjects;

public class constructor {

	int Id;
	String Name;
	
	constructor()
	{
		System.out.println("object will created:");
	}
	constructor(int Id,String Name)
	{
		this.Id=Id;
		this.Name=Name;
	}
	constructor(String Name,int Id)
	{
		this.Name=Name;
		this.Id=Id;
	}
	constructor(int Id)
	{
		this.Id=Id;
		this.Name=Name;
	}
	
}
