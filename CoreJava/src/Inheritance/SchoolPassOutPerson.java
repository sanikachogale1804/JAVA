package Inheritance;

public class SchoolPassOutPerson extends Person {
	
	String SchoolCerttificateNo;
	SchoolPassOutPerson(int Id,String name,String SchoolCertificateNo)
	{
		
		super(Id,name);
		this.SchoolCerttificateNo=SchoolCertificateNo;
	}

}
