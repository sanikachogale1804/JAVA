package Assignment;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first Number: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int num2=sc.nextInt();
		
		System.out.println("Before swapping:num1= "+ num1+" num2="+num2);
		
		num1 = num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        
        System.out.println("After Swapping:num1= "+ num1+" num2="+num2);
        
	}

}
