package collectionfrm.settopic.hs;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("rahul");
		queue.add("ankur");
		queue.add("birju");
		queue.add("sagar");
		queue.add("kunal");
		
		
		System.out.println("names.size() - " + queue.size());
		Iterator<String> itr = 	queue.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		
		
	}
}
