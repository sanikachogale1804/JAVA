package classesAndObjects;

public class Category1 {
        
	public static void main(String[] args) {
		  //constructor(default constructor)
		Category c1=new Category(1,"Electronics");//non-parameterized constructor
		/*new Category();
		new Category();*/
		System.out.println(c1.categoryId);
		System.out.println(c1.categoryName);
		Category c2=new Category("toys",2);
		System.out.println(c2.categoryName);
		System.out.println(c2.categoryId);
		
	}
}
