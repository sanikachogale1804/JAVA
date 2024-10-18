package ArrayPractice;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String weekdays[]= {"mon","tue","thur","fri","sat","sun"};
		System.out.println(weekdays.length);
		
		for(String days:weekdays)
		{
			System.out.println(days);
		}
	}
}