package LearnCollection;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExample3 {

	public static void main(String[] args) {
		ArrayList<Product> products=new ArrayList<Product>();
		
		products.add(new Product(101,"Mobile",90000));
		products.add(new Product(102,"Headphone",5000));
		products.add(new Product(103,"tablet",70000));
		products.add(new Product(104,"laptop",50000));
		System.out.println(products);
		
		products.stream()
		.forEach((p)->System.out.println(p.getProductName()+" "+p.getProductPrice()*80/100));
		
		
	}
	
}
