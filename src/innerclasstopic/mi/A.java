package innerclasstopic.mi;

// Outer Class
public class A 
{
	// private property of Outer Class
	private int value = 100;
	
	class B
	{
		void msg() 
		{
			System.out.println("value - " + value);
		}
	}
	public static void main(String[] args) 
	{
		A objA = new A();
		
		A.B objB = objA. new B();
		
		objB.msg();
	}
}
