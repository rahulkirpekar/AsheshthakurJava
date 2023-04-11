package collectionfrm.listtopic.al;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("rahul");//0
		list.add("ankur");//1
		list.add("brijesh");//2
		list.add("rakesh");//3
		list.add("ansh");//4
		
		Iterator<String> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			String value = itr.next();
			System.out.println(value);
		}
		
//		list.remove(3);
		
		// Update
//		list.set(2, "Birju");
		list.add(1, "Ashesh");
		//
		System.out.println("-----------------------");
		itr =	list.iterator();
		while(itr.hasNext()) 
		{
			String value = itr.next();
			System.out.println(value);
		}
		
	}
}
