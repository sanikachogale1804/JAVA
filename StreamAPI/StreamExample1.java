package StreamAPI;

import java.util.ArrayList;

public class StreamExample1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=20;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		
		for(int num:list)
		{
			System.out.println(num);
		}
	}

}
