class p17
{
	public static void main(String args[])
	{
		int numbers[]={100,4,67,78,90,11};
		//largest 4       //smallest 90
		
		int smallest=numbers[0];
		int biggest=numbers[0];
		
		for(int n:numbers)
		{
			if(smallest>n)
				smallest=n;
			if(biggest<n)
				biggest=n;
		}
		System.out.println(smallest);
		System.out.println(biggest);
	}
}