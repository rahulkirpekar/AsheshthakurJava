package exceptiontopic.doubts;

import java.io.IOException;

public class TestApp1 
{
	public static void isValidAgeForVote(int age) //throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception
			throw new InvalidAgeException("Welcome for Vote");
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args)
	{
		try 
		{
			isValidAgeForVote(0);
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
	}
}
