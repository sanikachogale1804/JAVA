import java.util.Scanner;
class dowhile1
//do me likho apko kya print karna hai aur while me condition likho kab tak print karna hai
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Hello");
			n=sc.nextInt();
		}while(n==1);
	}
}