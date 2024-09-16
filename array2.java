import java.util.Scanner;  //scanner ka object banaya matlab aap function ko call karte hai
class array2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int numbers[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			numbers[i]=sc.nextInt();
		}
		System.out.println("==========================");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(numbers[i]);
		}
		
	}
}