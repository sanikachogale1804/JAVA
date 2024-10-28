package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,78,89,67,56,45);
		list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        List<Integer> greaterthan20 = list.stream().filter(n->n>20).collect(Collectors.toList());
        System.out.println(greaterthan20);
		
	    List<String> names=Arrays.asList("Sanika","Sneha","akshata","tushar");
	    
	    List<String> startwiths = names.stream().filter(name->name.startsWith("S")).collect(Collectors.toList());
	    System.out.println(startwiths);
	    
	}
}
