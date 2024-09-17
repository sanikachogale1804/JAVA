import java.util.Scanner;
class array4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String weekdays[]={"mon","Tue","wed","thurs","fri","sat","sun"};
		int primenumbers[]={11,13,17,5};
		int sum=0;
		
		System.out.println("weekdays:"+weekdays.length);
		System.out.println("primenumbers:"+primenumbers.length);
		
		//enhance loop bolta hai aap bas array ka name do iterations me sambhal lunga
		//enhanced for loop
		
		for(int numbers:primenumbers)
		{
			sum=sum+numbers;
			System.out.println(numbers);
			
		}
		System.out.println(sum);
		
		for(String days:weekdays)
		{
			System.out.println(days);
		}
		System.out.println("=================================");
		
		char ch[]={'a','c','e','i','a','o','a'};
		int count=0;
		
		for(char character:ch)
		{
			if(character=='a')
			{
				count++;
			}	
		}
		System.out.println("count:"+count);
		
		char c[]={'a','e','g','s','o'};
		int vowel=0;
		int consonent=0;
		
		for(char charct:c)
		{
			if(charct=='a'|| charct=='e'||charct=='i'||charct=='o'||charct=='u')
			{
				vowel++;
			}
			else
			{
				consonent++;
			}
		}
		System.out.println("vowels:"+vowel);
		System.out.println("consonent:"+consonent);
		
	}
}