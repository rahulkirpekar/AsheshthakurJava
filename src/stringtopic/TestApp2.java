package stringtopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		String name1 ="ashesh";
//		String name2 = name1 + " ";

		StringBuffer sb1 = new StringBuffer("ashesh"); 
		
		StringBuffer sb2 = sb1.append(" Sharma");
		
		
		System.out.println(sb1 +" "+sb1.hashCode());
		System.out.println(sb2 +" "+sb2.hashCode());
		
	}
}
// name = madam--check string is palindrome or not 
