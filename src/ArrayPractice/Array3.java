package ArrayPractice;

public class Array3 {

	public static void main(String[] args) {
		int num[][]= {{12,67,45},{78,96,37}};
		System.out.println(num[0][2]);
		System.out.println("==============");
		for(int i=0;i<num.length;i++)
		{
			//System.out.println(i);
			for(int j=0;j<3;j++)
			{
				System.out.println(num[i][j]);
			}
		}
	}
	
}
