package Inheritance;

public class PartTimeEmployee extends Employee{
	
	int bonus;
	
	PartTimeEmployee(int Id,String Name,int Salary,int bonus)
	{
		super(Id,Name,Salary);
		this.bonus=bonus;
	}

}
