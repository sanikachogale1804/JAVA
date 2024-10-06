package Patterns;
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		/*int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}	
		System.out.println("=========================");*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value:");
		int base=sc.nextInt();
		System.out.println("Enter power value:");
		int power=sc.nextInt();
		int result=1;
		for(int i=1;i<=power;i++)
		{
			result*=base;
		}
		System.out.println(result);
	}
	
}
