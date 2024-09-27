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
//Access Modifier
//Access Modifier use karte hai class control karne ke liye
//methods,variables,constructor and class pe hum access modifier laga sakte hai
//private access modifier jis class ke method me lagega hum sirf usi class ko access kar sakte hai
//private matlab same class ke andar ko access kar sakte hai
//default matlab same package ke andar ke classes ke methods hum access kar sakte hai bhahar ke classes ko access nahi kar sakta hai
//protected matlab same pasckage class ko access kar sakta hai or dusre class ke methods(ya dusre package me access karna hai) access karne hai to inheritance karna padega
//public metlab  kahi se bhi access karo










