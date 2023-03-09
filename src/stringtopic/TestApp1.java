package stringtopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 = "Ashesh";
		String name2 = "Ashesh";

		System.out.println(name1.equals(name2));// equals - values-- true
		
		System.out.println("name1==name2 - " + (name1==name2));// == reference check
		
		String name3 = "Royal";
		String name4 = name2;
		
		System.out.println("name2==name4 - " + (name2==name4));
		String name5 = name1 +  " Thakor";
		
		System.out.println("(name2==name5) -- " + (name2==name5));
	
		System.out.println(name1 + " - "+name1.hashCode());
		System.out.println(name5 + " - "+name5.hashCode());
	}
}
