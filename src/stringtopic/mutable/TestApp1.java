package stringtopic.mutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		String name1 = "rahul";
//		String name2 = name1.concat(" Kirpekar");
		
//		String -- immutbale
//		StringBuilder -- Mutable
//		StringBuffer - Mutable 
		
		
		StringBuilder name1 = new StringBuilder("rahul");
		System.out.println(name1 + " " + name1.hashCode());
		
		name1.append(" kirpekar");
		System.out.println(name1 + " " + name1.hashCode());
		
	}
}
