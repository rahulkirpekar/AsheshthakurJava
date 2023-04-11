package collectionfrm.listtopic.al;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		int choice=0;
		ArrayList<Student> list = new ArrayList<Student>();
		
		while(choice!=5) 
		{
			System.out.println("1) For Insert Record");
			System.out.println("1) For Insert Record");
			System.out.println("1) For Insert Record");
			System.out.println("1) For Insert Record");
			System.out.println("1) For Insert Record");
			
			switch (choice) 
			{
				case 1: // Insert code
						Student s = new Student();
						s.scan();
						list.add(s);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
	
				default:
					break;
			}
		}	
	
	}
}
