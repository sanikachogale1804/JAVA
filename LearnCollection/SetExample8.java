package LearnCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SetExample8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashSet<String> colors=new HashSet<String>();
		
		
		for(int i=1;i<=5;i++)
		{
			String names=sc.next();
			colors.add(names.toLowerCase());
		}
		
		System.out.println(colors);
	}
	
}
