package Practice;

public class Student1 {

	int id;
	String name;
	int age;
	int marks;
	Student1()
	{
		
	}
	
	Student1(int id,String name,int age,int marks)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	Student1(String name,int id,int age,int marks)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.marks=marks;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public String getName()
	{
		return this.name;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage()
	{
		return this.age;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public int getMarks()
	{
		return this.marks;
	}
}
