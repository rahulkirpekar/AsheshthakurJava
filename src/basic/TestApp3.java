package basic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		boolean flag=true;
		int k=2;
		int a[] = new int[50];

		for (int i = 0; i < a.length; ) 
		{
			flag=true;
			for (int j = 2; j < k; j++) 
			{
				if(k % j == 0) 
				{
					flag = false;
					break;
				}
			}
			if(flag) 
			{
				a[i] = k;
				i++;
			}
			k++;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+i+"] : " + a[i]);
		}
	}
}
