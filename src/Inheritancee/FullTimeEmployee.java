package Inheritancee;

public class FullTimeEmployee extends Employee{

	int bonus;
	
	FullTimeEmployee(int id,String name,int bonus)
	{
		super(id,name);
		this.bonus=bonus;
	}
	
}
