package LearnCollection;

import java.util.Comparator;
import java.util.TreeSet;

public class SetExample4 {

	public static void main(String[] args) {
		//TreeSet ka parent 1:SortedSet   2:NavigableSet
		//SortedSet,NavigableSet parent of treeset 
		//SortedSet,NavigableSet is interface
		//TreeSet ascending order ma output dega agar aap integer ke bare me baat kare hai to
		
		//Comparator<Integer>c=(o1,o2)->o1-o2;
		//o1,o2 automatic detect kar lega uska type integer hai
		TreeSet<Integer> treeSet=new TreeSet<Integer>((o1,o2)->o2-o1);
		treeSet.add(90);
		treeSet.add(56);
		treeSet.add(90);
		treeSet.add(17);
		treeSet.add(67);
		treeSet.add(2);
	//	treeSet.add(null); TreeSet me null values are not allowed
		System.out.println(treeSet);
		
		//sort direct nahi kar sakte isliye comparator use karte hai
		//comparator is functional interface 
		//comparator ka use karke humne decending me kiya
		
		
	}
	
}
