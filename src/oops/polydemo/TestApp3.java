package oops.polydemo;
import java.util.Scanner;
public class TestApp3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1) For AxisBank User");
		System.out.println("2) For SbiBank User");
		System.out.println("3) For KotakBank User");
		int choice = sc.nextInt();
		RbiBank rbiBank =  null;
		switch(choice) 
		{
			case 1 : rbiBank =  new AxisBank();
					 System.out.println("AxisBank User Home Loan Interest : " + rbiBank.getHomeLoan());
					 break;

			case 2 : rbiBank =  new SbiBank();
					 System.out.println("SbiBank User Home Loan Interest : " + rbiBank.getHomeLoan());
					 break;

			case 3 : rbiBank =  new KotakBank();
					 System.out.println("KotakBank User Home Loan Interest : " + rbiBank.getHomeLoan());
					 break;
		}
	}
}
