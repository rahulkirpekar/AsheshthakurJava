package oops;

import java.util.Scanner;

public class Student 
{
	private int rno;
	private String name ;
	private int std;
	boolean typeofStudent;
//	Constructor
//	Student()
//	{
//		System.out.println("START :: Default Student Constructor");
//		rno=1;
//		name="rahul";
//		std=12;
//		System.out.println("EXIT :: Default Student Constructor");
//	}
//	Student(int rno,String name)
//	{
//		System.out.println("START :: TWO-PARA Student Constructor");
//		this.rno=rno;
//		this.name=name;
//		System.out.println("EXIT :: TWO-PARA Student Constructor");
//	}
//	Student(int rno,String name, int std)
//	{
//		this(rno,name);
//		System.out.println("START :: THREE-PARA Student Constructor");
//		this.std=std;
//		System.out.println("EXIT :: THREE-PARA Student Constructor");
//	}
//	Student(int rno,String name, int std,boolean typeofStudent)
//	{
//		this(rno,name,std);
//		System.out.println("START :: FOUR-PARA Student Constructor");
//		this.typeofStudent=typeofStudent;
//		System.out.println("EXIT :: FOUR-PARA Student Constructor");
//	}
//	Student(Student s)
//	{
//		System.out.println("START :: COPY Student Constructor");
//		this.rno=s.rno;
//		this.name=s.name;
//		this.std=s.std;
//		this.typeofStudent=s.typeofStudent;
//		System.out.println("EXIT :: COPY Student Constructor");
//	}
	public void scan() 
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " " + name + " " + std + " " + this);
	}
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.disp();
//		System.out.println("START :: Main function");
//		// 1) Object creation + 2) Object Initialisation
//		Student s1 = new Student(1,"rahul",12,true);
//		s1.disp();
//		Student s2 = new Student(s1);
//		s2.disp();
//		System.out.println("EXIT :: Main function");
	}
}
