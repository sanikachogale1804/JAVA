package ClassesAndObjects;

public class class3 {

	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		e1.setdetails(1,"sanika",101);
		
		System.out.println(e1.printid(101));
		
		char alphabets[]= {'a','g','e','a','i','p','o','u'};
		for(char ch:alphabets)
		{
			System.out.println(ch);
		}
		
		int count=0;
		for(char ch1:alphabets)
		{
			if(ch1=='a')
			{
				count++;
			}
		}
		System.out.println("count"+count);
		
	}
	
}
