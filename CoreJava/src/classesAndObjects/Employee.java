package classesAndObjects;

public class Employee {

	//static ko object ke name ke through acces nahi karna hai
	//static variable ko app class name ke through hi acces kar sakte ho baki variable ko nahi kar sakte hai
	
	int empId;
	String empName;
	static String ceo="amit";
	
	Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
}
