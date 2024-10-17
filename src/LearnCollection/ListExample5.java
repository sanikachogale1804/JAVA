package LearnCollection;
import java.util.LinkedList;

public class ListExample5 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(56);
		list.add(60);
		list.add(45);
        System.out.println(list);
		System.out.println("===================");
        for(Integer i:list)
        {
        	System.out.println(i);
        }
        System.out.println("===================");
        list.add(0,76); //0 index pe hum 100 add kar rahe hai (add method is not replacing elements bus shift hore hai)
        System.out.println(list);
        Integer i=list.get(3);  //return me 1 index ki value milegi
        System.out.println(i);
        System.out.println(list.get(2));
        System.out.println("===================");
        //set method will replace elements and add wil add elements and shift elements 
        list.set(0,100);
        System.out.println(list);
	}

}
