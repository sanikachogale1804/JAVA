package Encapsulation;

public class category {
	
	private int id;
	private String name;
	
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
	
	public String toString()
	{
		return this.id+this.name;
	}
}
