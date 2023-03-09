package exceptiontopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		try 
		{
			try 
			{
				a[5]  = 100; // raise exception
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			try 
			{
				String name = "2134";
				System.out.println(name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			try 
			{
				String value = "453d";
				int no = Integer.parseInt(value);
				System.out.println("No : " + no);
			} catch (Exception e) 
			{
				e.printStackTrace();
			} 
		}catch(Exception e ) 
		{
			System.out.println("Exception catch block");
			e.printStackTrace();
		}
		System.out.println("After  catch block");
	}
}
