class while2
{
	public static void main (String args[])
	{
		int n=906;
		int digitcount=0;
		
		while(n!=0)
		{
			n=n/10;
			digitcount++;
		}
		System.out.println(digitcount);
	}
}