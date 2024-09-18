class two_dimensional_array1
{
    public static void main(String args[])
    {
	     int arr1[][]={{12,45},{78,98,56},{54,24,35,56}};
		 for(int i=0;i<arr1.length;i++)
		 {
			 System.out.println(arr1[i].length);
		 }
		 //enhance loop
		 for(int n[]:arr1)
		 {
			 System.out.println(n.length);
		 }
		 System.out.println("=====================");
		 //done by enhance loop (iterations)
		 String courses[][]={
			 {"HTML","CSS","JAVASCRIPT"},
			 {"MYSQL","MONGODB"},
			 {"CORE JAVA","SPRINGBOOT"}};
			
        int total_courses=0;			
		for(String ch[]:courses)
		{
			total_courses+=ch.length;
			for(String cour:ch)
			{
				System.out.println(cour);
				//total_courses++;
			}
		}
		System.out.println("total_courses:"+total_courses);
		
	}
}