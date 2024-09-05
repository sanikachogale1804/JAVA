import java.util.Scanner;
class vowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character:");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			   System.out.println("It is vowel");
			   break;
			   
			default:
			   System.out.println("It is consonent");
			
		}
	}
}