package Inheritancee;

public class SportStudent extends Student{

	int graceMarks;
	
	SportStudent(int id,String name,int rollNo,int marks,int graceMarks){
		super(id,name,rollNo,marks);
		this.graceMarks=graceMarks;
		
	}
	
}
