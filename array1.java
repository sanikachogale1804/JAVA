//Array is collection of similar datatypes
//int bola hai to int hi store kar sakte ho aur agar float bologe to float hi store karenge
//array me data in sequnce hotaa hai matlab ordered hota hai
//indexing tells where exactly our elements is 
//array banane ke liye new keyword use karte hai 
//syntax of array= datatype array_name[]=new datatype[size];  //it is a memory badme hum variable me store karte hai
                   //int        a[]     =new String[3]

class array1
{
	public static void main(String args[])
	{
		int numbers[]=new int[3];
		//  23 43 78
		//  0  1  2  
		numbers[0]=23;
		numbers[1]=43;
		numbers[2]=78;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		System.out.println("=================================");
		
		String name[]=new String[3];
		
		name[0]="sanika";
		name[1]="sneha";
		name[2]="riya";
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
	}
}