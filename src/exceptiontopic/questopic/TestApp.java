package exceptiontopic.questopic;

public class TestApp 
{
	public static void main(String[] args) 
	{
		int no1,no2,ans;
		no1=10;
		no2=0;
		
		try 
		{
			ans = no1/no2;
		} catch (Exception e) 
		{
			ans = 0;
			e.printStackTrace();
		}
		System.out.println("Ans : " + ans);
	}
}
