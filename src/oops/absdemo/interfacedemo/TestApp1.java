package oops.absdemo.interfacedemo;

public class TestApp1 implements Printable
{
	@Override
	public void print() 
	{
		System.out.println("TestApp1--print()");
	}
	public static void main(String[] args) 
	{
		TestApp1 app = new TestApp1();
		app.print();
		app.test2();
		
		Printable.test1();
	} 
}
