package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//throws keyword hum method ke sath lhikhte hai
//maine method banaya hai mai chahti hu aap use call karo to hum method ke baad throws bolenge 
//throws matlab hume nahi handle karna koi or karega handle
//jab tak call nahi karoge tab tak exception nahi dikhega

public class Example8 {
	
	public static void FileHandling() throws FileNotFoundException
	{
		new FileInputStream("abc.txt");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		try 
		{
		    FileHandling();
		}catch(FileNotFoundException e)
		{
			System.out.println("file not found");
		}
	}

}
