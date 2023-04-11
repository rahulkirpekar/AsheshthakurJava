package collectionfrm.listtopic.al;
import java.util.ArrayList;
import java.util.Iterator;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new Student(1, "rahul", 12);
		ArrayList list = new  ArrayList();
		list.add("rahul");//0 <--itr
		list.add(10);//1 // 
		list.add(true);//2
		list.add('R');//3
		list.add(234.324f);//4
		list.add(102345456.3);//5
		list.add(10L);//6
		list.add(s);//7
		System.out.println("list.size() : " + list.size());
		System.out.println("list.get(4) : " + list.get(4));
//		for (int i = 0; i < list.size(); i++) 
//		{
//			Object obj = list.get(i);
//			if (obj instanceof Student) 
//			{
//				s = (Student)obj;
//				s.disp();
//			} else 
//			{
//				System.out.println(obj);
//			}
//		}
		//-------------------------------------
		// ForEach Loops
//		for (Object obj : list) 
//		{
//			if (obj instanceof Student) 
//			{
//				s = (Student)obj;
//				s.disp();
//			} else 
//			{
//				System.out.println(obj);
//			}
//		}
		//-------------------------------------
		// iterator way = list
		
		Iterator itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if (obj instanceof Student) 
			{
				s = (Student)obj;
				s.disp();
			} else 
			{
				System.out.println(obj);
			}
		}
	}
}