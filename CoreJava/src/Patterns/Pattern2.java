package Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		
		int n=10;
		for(int j=1;j<=n;j++)
		{
			for(int i=1;i<=n;i++)
			{
				if(i==1 || j==1 || i==n || j==n || i==2 || j==2 || i==n-1 || j==n-1 || i==3 || j==3 || i==n-2 || j==n-2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
	
}
