package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamExample7 {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("sanika","sneha","riya","akshata","tushar");
		list.stream().forEach(n->System.out.println(n.charAt(n.length()-1)));
		
		
	}

}
