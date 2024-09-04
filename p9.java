class p9
{
	public static void main(String args[])
	{
		if(true || false)
		{
			System.out.println("A");
			if(true && false || true)
			{	
                System.out.println("C");
			}
			else
			{
				System.out.println("D");
			}
		}
		else
		{
			System.out.println("B");
		}
	}
}