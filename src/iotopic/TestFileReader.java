package iotopic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr = new  FileReader("C:\\Users\\Royal\\eclipse-workspace\\asheshocjp\\testfile2.txt");

			int temp;
			
			while(		(temp = fr.read())	!= -1	) 
			{
				char value = (char)temp;
				System.out.print(value);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
