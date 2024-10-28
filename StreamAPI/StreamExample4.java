package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample4 {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1,"laptop",80000));
		products.add(new Product(2,"mobile",0000));
		products.add(new Product(1,"headphone",8000));
		//lambda predicate ka object hai
		//p product ka object hai
		List<Product> pricegreaterthan10000 = products.stream().filter(p->p.getProductPrice()>10000).collect(Collectors.toList());
		System.out.println(pricegreaterthan10000 );
		
		List<String> printname = products.stream().map(name->name.getProductName()).collect(Collectors.toList());
		System.out.println(printname);
	}
}
