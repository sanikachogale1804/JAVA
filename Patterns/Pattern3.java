package Patterns;

public class Pattern3 {

	public static void main(String[] args) {
		int n=4;
		System.out.println("1");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("===========2=========");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("==============3==========");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==3)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
		System.out.println("=============4===========");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1 || i==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
		System.out.println("===========5=============");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==2 || i==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
		System.out.println("===========6=============");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==2 || i==4 )
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
		System.out.println("===========7=============");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("===========8=============");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
		System.out.println("============9=============");
		
	}
	
	
}
