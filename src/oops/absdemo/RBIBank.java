package oops.absdemo;

public abstract class RBIBank 
{
	//1) Data Members
	int homeLoanIntrst=10;
	//2) Constructor
	public RBIBank() 
	{
		System.out.println("RBIBank - Default Constructor");
	}
	//3) Member Function
	//	1) Abstract method
		abstract int getHomeLoanIntrst();
	//	2) Non-Abstract method
		void test() 
		{
			System.out.println("RBIBank- test()");
		}
	//4) static method
}
