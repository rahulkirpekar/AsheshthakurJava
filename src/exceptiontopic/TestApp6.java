package exceptiontopic;

import java.io.IOException;
class A
{
	void test() //throws Exception
	{
		throw new Error();
	}
}
public class TestApp6 
{
	public static void main(String[] args) 
	{
		A obj = new A();
		try 
		{
			obj.test();
		} catch (Exception e) 
		{
			System.out.println("Exception Block");
			e.printStackTrace();
		}
		finally 
		{
			// 1) System.exit();
			// 2) OS crashed
			System.out.println("Finally Block");
		}
	}
}
