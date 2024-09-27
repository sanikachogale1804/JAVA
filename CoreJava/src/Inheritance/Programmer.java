package Inheritance;

public class Programmer extends FullTimeEmployee {
	
	//alag alag inheritance ka combination matlab hybrid inheritance
	//2 class ki property ek sath hum nahi mang sakte
	//multipla paraents or unka ek child to unhe hum multiple inheritance bolenge
	//multiple inheritance  is not allowed in java through classes ,(hum interface ke through acces kar sakte hai)
	String ProgrammingLanguage;

	public Programmer(int Id, String Name, int Salary, int NoOfLeaves, String InsuranceDetails,
			String programmingLanguage) {
		super(Id, Name, Salary, NoOfLeaves, InsuranceDetails);
		this.ProgrammingLanguage = programmingLanguage;
	}
	
}
