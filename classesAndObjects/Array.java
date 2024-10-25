package classesAndObjects;

public class Array {

	public static void main(String[] args) {
		
		int arr[]= {12,23,23,12,45};
		System.out.println(arr[4]);
		
		for(int num:arr)
		{
			System.out.println(num);
		}
		System.out.println("==========================");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i);
		}
}
}
