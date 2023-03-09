package oops.absdemo.interfacedemo;
public interface Printable 
{
	int SIZE = 100;// public static final 
	void print();//public abstract 
	// static method
	public static void test1() 
	{
		System.out.println("Printtable -- static ---test1()");
	}
	// default
	public default void test2() 
	{
		test3();
		System.out.println("Printtable -- default---test2()");
	}
	// private 
	private  void test3() 
	{
		System.out.println("Printtable -- private ---test3()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}
