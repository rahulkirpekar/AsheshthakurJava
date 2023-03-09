package oops.finaldemo;

public class TestApp1 
{
	final int no;
	TestApp1() 
	{
		no =10;
	}
	TestApp1(int no) 
	{
		this.no = no;
	}
	TestApp1(TestApp1 t) 
	{
		this.no = t.no;
	}
	public static void main(String[] args) 
	{
		TestApp1 obj1 = new TestApp1(100);
		TestApp1 obj2 = new TestApp1(obj1);
		System.out.println("obj1.No : " + obj1.no);
		System.out.println("obj2.No : " + obj2.no);
	} 
}
