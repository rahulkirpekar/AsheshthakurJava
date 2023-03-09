package iotopic.seritopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\asheshocjp\\list.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
//			Object obj = oin.readObject();
//			Student s = (Student) obj;
			Student s = (Student) oin.readObject();
//			s.disp();
			System.out.println(s.getRno() + " "+s.getName() + " " +s.getStd());
			oin.close();
			fin.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}