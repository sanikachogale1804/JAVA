package classesAndObjects;

public class Category1 {
        
	public static void main(String[] args) {
		  //constructor(default constructor)
		Category c1=new Category(1,"Electronics");
		/*new Category();
		new Category();*/
		System.out.println(c1.categoryId);
		System.out.println(c1.categoryName);
		
		Category c2=new Category(2,"laptop");
		System.out.println(c2.categoryId);
		System.out.println(c2.categoryName);
	}
}
