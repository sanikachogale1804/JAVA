package LinkedAndArrayList;

import java.util.LinkedList;
import java.util.function.Predicate;

public class LinkedListExample3 {

	public static void main(String[] args) {
		
		LinkedList<Product> products=new LinkedList<Product>();
		
		products.add(new Product(101,"laptop",98000));
		products.add(new Product(102,"mobile",68000));
		products.add(new Product(103,"headphones",6000));
		
		Predicate<Product> p=(Product)->Product.getPrice()<10000;
		products.removeIf(p);
		System.out.println(products);
		
	}

}
