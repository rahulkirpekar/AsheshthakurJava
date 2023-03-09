package basic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+i+"] : ");
			a[i] = sc.nextInt();
		}
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (max < a[i])
			{
					max = a[i];
			}
			if (min > a[i]) 
			{
				min = a[i];
			}
		}
		System.out.println("Max Value is  : " + max);
		System.out.println("Min value is : " + min);
	}
}
