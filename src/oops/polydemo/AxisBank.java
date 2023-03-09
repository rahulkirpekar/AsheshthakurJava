package oops.polydemo;

public class AxisBank extends RbiBank
{
	@Override
	public int getHomeLoan() 
	{
		System.out.println("AxisBank getHomeLoanMethod ");
		return 10;
	}
}
