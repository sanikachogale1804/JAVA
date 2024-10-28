package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1,"laptop",80000));
		products.add(new Product(2,"mobile",20000));
		products.add(new Product(3,"headphone",8000));
	    
		List<Product> greatertham10000 = products.stream().
				filter(price->price.getProductPrice()>10000).
				collect(Collectors.toList());
		System.out.println(greatertham10000);
		
		List<Product> startwithm = products.stream().filter(name->name.getProductName().startsWith("m")).collect(Collectors.toList());
		System.out.println(startwithm);
		
	}
}
