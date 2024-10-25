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
	
		
		
	}
}
