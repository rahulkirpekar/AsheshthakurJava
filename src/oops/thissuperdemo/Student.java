package oops.thissuperdemo;

public class Student extends Person
{
	private int rno;
	private int std;
	
	public Student() 
	{
		System.out.println("Default Student Constructor");
	}
	public Student(int rno,String name) 
	{
		super(name);
//		this();
		System.out.println("START :  TWO--Para Constructor");
		this.rno = rno;
		System.out.println("EXIT :  TWO--Para Constructor");
	}
	public Student(int rno,String name,int std) 
	{
		this(rno,name);
		System.out.println("START :  THREE--Para Constructor");
		this.std = std;
		System.out.println("EXIT :  THREE--Para Constructor");
	}
	public void disp() 
	{
		System.out.println(rno + " "+getName() + " " + std);
	}
	public static void main(String[] args) 
	{
		Student s = new Student(1, "rahul", 12);
		s.disp();
		
	}
}
