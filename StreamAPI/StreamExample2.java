package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Sanika","akshata","tushar","riya");
		list.stream().forEach((name)->{
			for(int i=1;i<=20;i++)
			{
			System.out.println(name);
			}
			System.out.println("======================================");
		});
		
		System.out.println(list);
		list.stream().forEach((name)->System.out.println(name+" "+name.charAt(name.length()-1)));
		
	}
	
}
