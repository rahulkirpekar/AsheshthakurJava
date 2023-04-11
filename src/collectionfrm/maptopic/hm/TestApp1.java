package collectionfrm.maptopic.hm;

import java.util.TreeMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<Integer,String>();
		
		map.put(5, "Ashesh");// kv<---Entry
		map.put(2, "Rakesh");
		map.put(3, "Brijesh");
		map.put(1, "Sagar");
		map.put(4, "Kunal");

		
		for( Map.Entry<Integer, String> e	: map.entrySet()) 
		{
			System.out.println(e.getKey() + " " +e.getValue());
		}
	}
}
