package ClassesAndObjects;

public class Student {

	int id;
	String name;
	int rollNo;
	
	void details()
	{
		System.out.println("student details");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	
}
