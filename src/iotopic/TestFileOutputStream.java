package iotopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestFileOutputStream 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name = sc.nextLine();// abc

		byte b[] = name.getBytes();//b[0]-97 , b[1] -98, b[2]-99
		try 
		{
			// writting Process
			FileOutputStream fout = new FileOutputStream("testfile1.txt");
			
			fout.write(b);
			
			System.out.println("Successfully write data into file");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}