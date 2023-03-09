package iotopic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWriter 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name = sc.nextLine();// abc

		try 
		{
			FileWriter fw = new FileWriter("testfile2.txt");

			fw.write(name);
			
			fw.close();
			System.out.println("success");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
