package innerclasstopic.ni;

public class A 
{
	private static int no = 100;
	static class B
	{
		void msg() 
		{
			System.out.println("No : "  +no);
		}
	}

	public static void main(String[] args) 
	{
		A.B objB = new A.B();
		
		objB.msg();
	}
}
