package doubts;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Vehicle vehicle;
		System.out.println("Enter Below Choice : ");
		System.out.println("1) For TwUser ");
		System.out.println("2) For LmvUser ");
		System.out.println("3) For HmvUser ");
		int choice = new Scanner(System.in).nextInt();

		switch(choice) 
		{
			case 1: vehicle = new TwUser();
					vehicle.getSpec();
					break;
					
			case 2: vehicle = new LmvUser();
					vehicle.getSpec();
					break;
					
			case 3: vehicle = new HmvUser();
					vehicle.getSpec();
					break;
		}
	}
}
