package innerclasstopic.li;
public class A 
{
	private int no = 10;
	void disp() 
	{
		class B
		{
			void msg() 
			{
				System.out.println("No : " + no);
			}
		}
		B obj = new B();
		obj.msg();
	}
	public static void main(String[] args) 
	{
		A obj = new  A();
		obj.disp();
	}
}
