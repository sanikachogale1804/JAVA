package Inheritancee;

public class Inheritance2 {

	public static void main(String[] args) {
		FullTimeEmployee fp=new FullTimeEmployee(1,"sanika",80000);
		System.out.println(fp.id);
		System.out.println(fp.name);
		
		PartTimeEmployee p=new PartTimeEmployee(2,"sneha",50000);
		System.out.println(p.name);
	}
	
}
