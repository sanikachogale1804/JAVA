package Encapsulation;

public class ECP2 {

	public static void main(String[] args) {
		category c=new category();
		c.setId(1);
		//System.out.println(c.getId());
		int id=c.getId();
		System.out.println(id);
		
		c.setName("electronics");
		//System.out.println(c.getName());
		String name=c.getName();
		System.out.println(name);
	}
	
}
