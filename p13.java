class p13
{
	public static void main(String args[])
	{
		//Typecasting
		//Typecasting matlab ek datatype ko dusre datatype me convert karna hai
		//widening typecasting matlab chote se bada jate ho matlab small container put in big container
		//widening matlab bade datatype me chota datatype ye java compiler khud kar leta hai par narrowing me hame datatype convert karna padta hai
		//converting a smaller type to  a larger datatype
		//widening automaticall ho jata hai
		int a=100;
		long b=a;
		System.out.println(a);
		
		//narrowing casting bade datatype se chote datatype me 
		//converting a larger datatype to a smaller datatype
		//narrowing (manually )hame karna padta hai
		int c=123;
		byte d=(byte)c;//int to byte conversion
		System.out.println(d);
		
		int n=66;
		char ch=(char)n;
		System.out.println(ch); 
		System.out.println((char)n); 
	}
}