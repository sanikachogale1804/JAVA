package classesAndObjects;

public class Category {

	int categoryId;
	String categoryName;
	
	//jab jab aap object banate ho constructor apne aap call hota hai
	//cnsrtuctor matlab invoked (matlab call hoga) whenever object will be created
	//constructor ka name or class ka name same hona chahiye
	//constructor will be called whenever object will be created
	//har ek object ke liye constructor load hoga
	//number of parameters should not be same but in case same hai to type of parameters alag rakho or isiko constructor overloading bolte hai
	//1 se jyada constructor honge to usko constructor overloading bolenege
	
	Category(int categoryId,String categoryName)
	{
		this.categoryId=categoryId;
		this.categoryName=categoryName;
	}
	
}
