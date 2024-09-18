class multi_dimensional_array
{
    public static void main(String args[])
    {
         //one dimensional               multi dimensional(two,three,four dimensional)
		 int numbers[][]={{12,23,56},{45,23,78}};
		  //                  0          1
							   
		System.out.println(numbers[0][0]);		
		System.out.println(numbers[1][2]);		
        System.out.println(numbers[0][1]);	

		System.out.println("==========================");	
		
		int arr1[][]={{12,45,87},{34,65,23}};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				//System.out.println(i+" ");
				System.out.println(arr1[i][j]);
			}
		}
		System.out.println("======================");
		//enhanced for loop //iterations
		for(int n[]:arr1 )
		{
			for(int i:n)
			{
				System.out.println(i);
			}
		}
		
    }
}