\package oops.polydemo;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];
		Scanner sc  = new Scanner(System.in);
		int rno,std;
		String name ;

		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();

			System.out.println("Enter Rno :  ");
			rno = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name :  ");
			name = sc.nextLine();
			System.out.println("Enter Std :  ");
			std = sc.nextInt();

			s[i].setRno(rno);
			s[i].setName(name);
			s[i].setStd(std);
		}
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i].getRno() + " " + s[i].getName() + " " + s[i].getStd());
		}
	}
}