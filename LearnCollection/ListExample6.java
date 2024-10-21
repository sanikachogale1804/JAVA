package LearnCollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ListExample6 {

	public static void main(String[] args) {
		LinkedList names=new LinkedList<String>();
		names.add("sanika");
		names.add("riya");
		names.add("akshata");
		names.add("tushar");
		
		Predicate<String> n=(name)->name.startsWith("r");
		names.removeIf(n);
		System.out.println(names);
		//names.removeIf(name->name.startsWith("r"));
		
		LinkedList<Product> products=new LinkedList<Product>();
		
		products.add(new Product(101,"laptop",58000));
		products.add(new Product(102,"mobile",68000));
		products.add(new Product(10,"headphones",6000));
		
		/*System.out.println(products);
		products.removeIf(p->p.getProductPrice()<10000);
		System.out.println(products);*/
		
		System.out.println("===================");
		//java ke pass logic nahi hai to compare two objects
		//whenever you calles collection method internally compareTo method call hoga
		//comparator ka type product hoga kunki hum product ke liye logic likhre
		
		//Collections.sort(products);
		Comparator<Product> priceComparator=(p1,p2)->p1.getProductPrice()-p2.getProductPrice();
		Collections.sort(products,priceComparator);//collection ka name,object
		Comparator<Product> nameComparator=(p1,p2)->p1.getProductName().compareTo(p2.getProductName());
		Collections.sort(products,nameComparator);
		Comparator<Product> idComparator=(p1,p2)->p1.getProductId()-(p2.getProductId());
		Collections.sort(products,idComparator);
		
		
		System.out.println(products);
	}
	
}
