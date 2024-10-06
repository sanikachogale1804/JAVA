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
		
		int base=2;
		int power=6;
		int result=1;
		for(int i=1;i<=power;i++)
		{
			result*=base;
		}
		System.out.println(result);
	}
	
}
