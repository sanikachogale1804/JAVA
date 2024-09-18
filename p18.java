class p18
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
		 
		 String courses[][]={
			 {"HTML","CSS","JAVASCRIPT"},
			 {"MYSQL","MONGODB"},
			 {"CORE JAVA","SPRINGBOOT"}};
			 	 
		for(String ch[]:courses)
		{
			for(String cour:ch)
			{
				System.out.println(cour);
			}
		}
	}
}