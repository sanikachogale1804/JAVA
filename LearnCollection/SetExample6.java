package LearnCollection;

import java.util.Comparator;
import java.util.TreeSet;

public class SetExample6 {

	public static void main(String[] args) {
	
		//treeset me jo bhi value pass karo vo uska datatype khud detect kar lega
		TreeSet<Product> treeset=new TreeSet<Product>((p1,p2)->p2.getProductId()-p1.getProductId());
		
		treeset.add(new Product(101,"laptop",58000));
		treeset.add(new Product(102,"mobile",68000));
		treeset.add(new Product(103,"Headphone",30000));
		
		//products ke object direct compare nahi hote is liye comparator banaye
		//comparable me ek hi logic ho sakta hai is liye comparator is better
		//comparator and comparable these interface provide logic how to compare two objects
		System.out.println(treeset);
	}
	
}
