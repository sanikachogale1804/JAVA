package classesAndObjects;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		int arr[][]={{12,35,78},{67,64,89}};
		//System.out.println(arr[0][2]);
		
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(i+" ");
				System.out.println(arr[i][j]);
			}
		}*/
		for(int i[]:arr)
		{
			for(int n:i)
			{
				System.out.println(i);
			}
		}
	}
}
