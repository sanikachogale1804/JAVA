package Patterns;

public class Pattern5 {

	public static void main(String[] args) {
		
		int n=6;
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
		System.out.println("=========================");
		
		int sum=0;
		int num=1000;
		for(int i=1;i<=num;++i)
		{
			sum=sum+i;
			
		}
		System.out.println("sum is:"+sum);
	}
	
}
