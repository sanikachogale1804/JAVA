package Inheritance;

public class FullTimeEmployee extends Employee {
	
	int NoOfLeaves;
	String InsuranceDetails;
	
	FullTimeEmployee(int Id,String Name,int Salary,int NoOfLeaves,String InsuranceDetails)
	{
		super(Id,Name,Salary);//parent ko bheja
		this.NoOfLeaves=NoOfLeaves;
		this.InsuranceDetails=InsuranceDetails;
	}

}
