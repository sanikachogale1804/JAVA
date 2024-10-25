package LearnCollection;

import java.util.HashSet;
import java.util.Scanner;

public class SetExample2 {

	public static void main(String[] args) {
		HashSet<String> colors=new HashSet<String>();  //HashSet duplicate data ko eliminate karta hai
		//HashSet is unordered
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
			String color=sc.next();
			colors.add(color.toLowerCase());
		}
		
		System.out.println(colors);
		
		colors.clear();
		System.out.println(colors);
	}
	
}
