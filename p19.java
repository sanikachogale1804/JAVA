//copy(instance) matlab object and class matlab blueprint
//class name always start with capital letter
//camel case
//objects heap memory me store hote hai
//unrefernced object matlab variable nahi diya
//instance variable matlab object only
//object access karne ke liye dot lagaynege
//Syntax of class
/*class className
{
  //variable
  //method
}*/

class Student
{
	int rollNo;
	String name;
}

class p19
{
	public static void main(String args[])
	{
	    Student s1=new Student();
        Student s2=new Student();		
		s1.rollNo=(101);
		s1.name=("Sanika");
		s2.rollNo=102;
		s2.name="sneha";
		
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
		System.out.println(s2.rollNo);
		System.out.println(s2.name);
	}
}