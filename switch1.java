import java.util.Scanner;
class switch1
{
	public static void main(String args[])
	{
		/*switch(112)
		{
			case 1:
			   System.out.println("case 1");
			   break;
			case 2:
			   System.out.println("case 2");
			   break;
			case 3:
			   System.out.println("case 3");
			   break;
			   
			default:
			   System.out.println("No switching case");
			   
		}*/
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("1:monday 2:Tuesday 3:wednesday 4:thursday 5:friday 6:saturday 7:sunday");
		switch(n)
		{
			case 1:
			   System.out.println("Monday");
			   break;
			case 2:
			   System.out.println("Tuesday");
			   break;
			case 3:
			   System.out.println("Wednesday");
			   break;
			case 4:
			   System.out.println("Thursday");
			   break;
			case 5:
			   System.out.println("Friday");
			   break;
			case 6:
			   System.out.println("Saturday");
			   break;
			case 7:
			   System.out.println("Sunday");
			   break;
			default:
			   System.out.println("No switching case");
			   
		}
		
	}
}