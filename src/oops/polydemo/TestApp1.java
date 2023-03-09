package oops.polydemo;

public class TestApp1 
{
	public void add(int no1,int no2) 
	{
		System.out.println("add---> int two args ");
	}
	public void add(float no1,float no2) 
	{
		System.out.println("add--->float two args ");
	}
	public void add(int no1,int no2,int no3) 
	{
		System.out.println("add---> three args ");
	}
	public void add(int no1,int no2,int no3,int no4) 
	{
		System.out.println("add---> four args ");
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		
		obj.add(10, 20);
		
		obj.add(10.43f, 20.65f);
		
		obj.add(10, 20,30);
		obj.add(10, 20,30,40,50);

	}
}
