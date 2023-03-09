package iotopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENtre No1 : ");
		int no = sc.nextInt();// negative
		if (no > 0) 
		{
			System.out.println("Positive NO : " + no);
		} else 
		{
			System.err.println("Negative No : " + no);
		}
	}
}
