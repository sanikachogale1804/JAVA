package StringExamples;


public class Example5 {

	public static void main(String[] args) {
		String s1="MooooooooOObile";
		int count=0;
		
		for(int i=(s1.length()-1);i>=0;i--)
		{
			
			System.out.print(s1.charAt(i));
		}
		System.out.println("===========================");
		
		for(char ch:s1.toCharArray())
		{
			if(ch=='o' || ch=='O')
				count++;	
		}
		System.out.println(count);
		
		String vowels="Hello world";
		
		
	
		//1)count number of vowels in string
		//2)palindrome
		//3)H        e             l        l   o  starting,ending and beech ka space bhi nikalo
		//4)priti amit joel gurjeet  string t se kitne start hore hai 
	}
	
}
