package LearnCollection;

import java.util.Comparator;
import java.util.TreeSet;

public class SetExample7 {

	public static void main(String[] args) {
		
		TreeSet<Product> treeset=new TreeSet<Product>((p1,p2)->p1.getProductName().compareTo(p2.getProductName()));
		//TreeSet<Product> treeset=new TreeSet<Product>((p1,p2)->p2.getProductPrice()-p1.getProductPrice());
		//TreeSet<Product> treeset=new TreeSet<Product>((p1,p2)->p2.getProductId()-p1.getProductId());
		treeset.add(new Product(101,"Mobile",90000));
		treeset.add(new Product(102,"Headphone",5000));
		treeset.add(new Product(103,"tablet",70000));
		treeset.add(new Product(104,"laptop",50000));
		System.out.println(treeset);
	}

}
