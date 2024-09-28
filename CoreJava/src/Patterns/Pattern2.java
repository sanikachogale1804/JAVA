package Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		
		int n=10;
		for(int j=1;j<=n;j++)
		{
			for(int i=1;i<=n;i++)
			{
				if(i==1 || j==1 || i==n || j==n)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
}
