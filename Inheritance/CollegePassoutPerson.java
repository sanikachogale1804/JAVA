package Inheritance;

public class CollegePassoutPerson extends SchoolPassOutPerson{

	String CollegeCerificateNo;
	
	CollegePassoutPerson(int Id,String name,String SchoolCertificateNo,String CollegeCerificateNo)
	{
		//super parent constructor ko call karega
		//ye parameters parent class ko bhejega
		super(Id,name,SchoolCertificateNo);
		this.CollegeCerificateNo=CollegeCerificateNo;
	}
}
