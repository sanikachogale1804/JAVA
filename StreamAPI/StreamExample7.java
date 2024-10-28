package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamExample7 {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=20;i++)
		{
			list.add(i);
		}
		System.out.println(list);
	}

}
