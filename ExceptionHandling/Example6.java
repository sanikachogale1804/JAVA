package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//kuch exception code compile karne nahi dete usko compile time exception bolenge vo bolega pehle exception handle karo
public class Example6 {
   public static void main(String[] args) {
	
	   try
	   {
		   new FileInputStream("abc.txt");
	   }catch(FileNotFoundException e)
	   {
		   System.out.println("file not found");
	   }
	   
	   
   }
}
