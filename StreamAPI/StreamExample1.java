package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=20;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		System.out.println("=========================");
		
		Stream<Integer> stream = list.stream();
		Consumer<Integer> c=(i)->System.out.println(i);
		stream.forEach(c);
		
		List<String> names=Arrays.asList("sanika","sneha","Akshata","tushar","joel");
		Stream<String> stream2 = names.stream();
		//Consumer<String> name=(n)->System.out.println(n+ " "+(n.charAt(n.length()-1)));
		//stream2.forEach(name);
		stream2.forEach((n)->System.out.println(n+ " "+(n.charAt(n.length()-1))));
		
	}

}

