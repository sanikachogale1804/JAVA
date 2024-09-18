class two_dimensional_array2
{
	public static void main(String args[])
	{
		int arr1[][]={{1,3,5},{6,7,8}};
		
		for(int n[]:arr1)
		{
			for(int numbers:n)
			{
				System.out.print(numbers+ " ");
			}
			System.out.println();
		}
	}
}