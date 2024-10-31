package LearnCollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class SetExample9 {
	
	public static void main(String[] args) {
	
		
		TreeSet<Integer> treeset=new TreeSet<Integer>((o1,o2)->o2-o1);
		treeset.add(78);
		treeset.add(900);
		treeset.add(100);
		treeset.add(200);
		System.out.println(treeset);
		
}
}
