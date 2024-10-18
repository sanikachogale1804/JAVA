package ClassesAndObjects;

public class Student {

	int id;
	String name;
	int rollNo;
	int marks;
	
	void details()
	{
		System.out.println("student details");
	}
	Student(int id,String name,int rollNo,int marks)
	{
		this.id=id;
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	
}
