package LearnCollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sanika","Pooja","Amit","Joel","Tushar");
		names.stream().forEach((name)->{
			for(int i=1;i<=5;i++)
			{
				System.out.println(name);
			}
			System.out.println("===============================");
		});
			System.out.println(names);
			names.stream().forEach((name)->System.out.println(name.charAt(0)+" "+name.charAt(name.length()-1)));
	
	}

}
