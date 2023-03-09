package exceptiontopic;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		System.out.println("Statement----1");
		System.out.println("Statement----2");
		System.out.println("Statement----3");
		System.out.println("Statement----4");
		System.out.println("Statement----5");
		int a[] = new int[5];
		// exception Handlling by try catch
		try 
		{
			a[5]  = 100;
			System.out.println(a[5]);
		}catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Catch Block Hanlded Exception");
			e.printStackTrace();
		}
		try 
		{
			a[5]  = 100;
			System.out.println(a[5]);
		}catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Catch Block Hanlded Exception");
			e.printStackTrace();
		}
		System.out.println("Statement----6");
		System.out.println("Statement----7");
		System.out.println("Statement----8");
		System.out.println("Statement----9");
		System.out.println("Statement----10");
//		String name = null;
//		System.out.println(name.length());// NullPointerException

//		String value = "1f2a3h";
//		int no = Integer.parseInt(value);// NumberFormateException
//		System.out.println(no);

//		int a[] = new int[5];
//		a[5] = 100;// ArrayIndexOutofBoundException
//		System.out.println(a[5]);		

//		String name = "royal";	
//		System.out.println(name.charAt(name.length()));//StringIndexoutOfBoundException
	}
}
