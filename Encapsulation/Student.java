package Encapsulation;
//Encapsulation
//variable and methods ek class me rakhna hai
//rules: 1)private variable 2)public methods 
//public methods dusre class ke through variable me data set karne ke liye help karenge
//getid helps us to get id from another class
//Encapsulation hum setter(value set karna) and getter(value get karna) se kam hota hai
//har ek variable ka setter alag alag hoga
//value set karne ka return type void hi rakenge
//get ke time value mang rahe hai is liye parameter nahi diya
//setId giving nothing to me(kuch return nahi kara hai) is liye hum variable me store nahi karenge
//security purpose (it set security layer on the class)
public class Student {

	private int Id;
	private String name;
	private int age;
	public void setId(int Id)
	{
		this.Id=Id;
	}
	public Student(int id, String name, int age) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
	}
	public int getId(String password)
	{
		if(password.equals("u#1"))
		return this.Id;
		else
			return 0;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return this.age;
	}
	
	public String toString()
	{
		return this.Id+" "+this.name;
	}
}
