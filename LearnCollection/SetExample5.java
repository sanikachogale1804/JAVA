package LearnCollection;

import java.util.TreeSet;

public class SetExample5 {

	public static void main(String[] args) {
		
		//hashset and linkedhashset ke sare methods treeset ke pass hai par treeset ke methods hashset and linkedhashset ke pass nahi hai
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		treeset.add(20);
		treeset.add(100);
		treeset.add(10);
		treeset.add(76);
		treeset.add(330);
		treeset.add(500);
		
		System.out.println(treeset);
		System.out.println(treeset.higher(76));
		System.out.println(treeset.lower(20));
	
		System.out.println("===============================");
		//ceiling chaeck karega value present hai ki nahi agar hai present to vahi value dikhayega agar nahi hai to fir usse badi value milegi
		System.out.println(treeset.ceiling(120));
		System.out.println(treeset.floor(20)); //floor bhi yahi bolta hai agar value nahi hai to usse choti value milegi
		
		System.out.println("===============================");
		
		System.out.println(treeset.headSet(100));  //100 ke aage jitne elemnts hai utne dikhenge
		System.out.println(treeset.headSet(100,true));  //100 ko bhi include karna hai
		
		
		System.out.println("===============================");
		System.out.println(treeset.tailSet(20));  //tailset me jo bhi pass karoge include hoga
		System.out.println(treeset.tailSet(20,false));  //abhi 20 include nahi hoga
		
		System.out.println("===============================");
		System.out.println(treeset.subSet(20, 330));  //20 inclusive and 330 exclusive
		System.out.println(treeset.subSet(20,true, 330,true));  //abhi 330 include hoga 
		
	}
	
}
