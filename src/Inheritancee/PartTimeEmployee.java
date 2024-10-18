package Inheritancee;

public class PartTimeEmployee extends Employee{

	int salary;
	
	PartTimeEmployee(int id,String name,int salary)
	{
		super(id,name);
		this.salary=salary;
	}
	
}
