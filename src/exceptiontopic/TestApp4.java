package exceptiontopic;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		TestApp4 app = new TestApp4();
		
		app = null;
		
		System.gc();
		
	}
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("Finalise called by Gc ---- " );
	}
}
