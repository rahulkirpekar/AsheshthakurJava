package exceptiontopic;

// 1) checked 
public class InvalidAgeforVoteException extends Exception
{
	public InvalidAgeforVoteException(String msg) 
	{
		super(msg);
	}
}
