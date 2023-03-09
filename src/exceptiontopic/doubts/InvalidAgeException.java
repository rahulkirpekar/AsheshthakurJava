package exceptiontopic.doubts;

// custom Exception -- 
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
