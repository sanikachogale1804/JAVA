package LearnCollection;
import java.util.ArrayList;

public class ListExample3 {

	public static void main(String[] args) {
		ArrayList<Product> products=new ArrayList<Product>();
		/*Product p1=new Product(101,"laptop",98000);
		products.add(p1);*/
		products.add(new Product(101,"laptop",98000));
		products.add(new Product(102,"mobile",68000));
		products.add(new Product(103,"headphones",6000));
		
		System.out.println(products);
		
		for(Product p:products)
		{
			System.out.println(p);
		}
		System.out.println("========================");
		for(Product p:products)
		{
			if(p.getProductPrice()>20000)
			{
				System.out.println();
			}
		}
		System.out.println("========================");
		
		for(Product p:products)
		{
			if(p.getProductName().startsWith("m"))
			{
				System.out.println(p);
			}
		}
		System.out.println("========================");
	}
	
}
