package Inheritance;

public class HierarchicalInheritance {
	
	public static void main(String[] args) {
		
		FullTimeEmployee FP=new FullTimeEmployee(11,"sneha",40000,5,"101");
		System.out.println(FP.Id);
		System.out.println(FP.NoOfLeaves);
		System.out.println(FP.InsuranceDetails);
		System.out.println("================================");
		
		PartTimeEmployee PT=new PartTimeEmployee(12,"riya",60000,20000);
		System.out.println(PT.Name);
		System.out.println(PT.Salary);
		System.out.println(PT.bonus);
		
	}

}
