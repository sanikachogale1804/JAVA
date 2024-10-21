package Abstraction;

abstract class BusinessLogic {
	
	abstract void coupons();

}
class weekdays extends BusinessLogic
{
	void coupons()
	{
		System.out.println("weekdays coupons:");
	}
}

class weekends extends BusinessLogic
{
		void coupons()
		{
			System.out.println("weeknds coupons:");
		}
}
