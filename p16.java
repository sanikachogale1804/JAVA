import java.util.Scanner;
class p16
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String weekdays[]={"mon","Tue","wed","thurs","fri","sat","sun"};
		int primenumbers[]={11,13,17,5};
		
		System.out.println("weekdays:"+weekdays.length);
		System.out.println("primenumbers:"+primenumbers.length);
		
		//enhance loop bolta hai aap bas array ka name do iterations me sambhal lunga
		//enhanced for loop
		
		for(int numbers:primenumbers)
		{
			System.out.println(numbers);
		}
		
	}
}