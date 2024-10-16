package Practice;

public class Student1 {

	int id;
	String name;
	int age;
	Student1()
	{
		
	}
	
	Student1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Student1(String name,int id)
	{
		this.name=name;
		this.id=id;
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
}
