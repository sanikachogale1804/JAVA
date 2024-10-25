package LearnCollection;

import java.util.TreeMap;

public class MapExample3 {
	public static void main(String[] args) {
//		treemap bolta hai chije sort karke milegi
//		product ka object chahiye the is liye value me Product add kiya
		
//		agar humne key di to pura object milega
//		comparator ka type vahi hoga jo key ka type hoga
		TreeMap<Integer, Product> products=new TreeMap<Integer, Product>((p1,p2)->p2-p1);
		
		products.put(101, new Product(101,"mobile",70000));
		products.put(102, new Product(102,"laptop",90000));
		products.put(99, new Product(99,"tablet",40000));
		
		System.out.println(products);
//		System.out.println(products.get(101).getProductPrice());
		Product laptop= products.get(102);
		System.out.println(laptop.getProductPrice());
		
		System.out.println("===========================");
		
	}

}
