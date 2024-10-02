package Abstraction;

public class AbstractionExample3 {

	public static void main(String[] args) {
		
		BusinessLogic weekdays=new BusinessLogic() {
			void coupons()
			{
				System.out.println("weekdays");
			}
		};
		weekdays.coupons();
		
		new weekends().coupons();
Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			if(i==3)
			{
				break;
			}
		}
		
	}
}
