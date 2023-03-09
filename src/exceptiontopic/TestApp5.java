package exceptiontopic;
// Two type of Exception
// 1) Checked Exception(CompileTime ---Compiler Through raise)
// 2) UnChecked Exception(RunTime ---JVM Through raise)
public class TestApp5 
{
	public static void isValidForVote(int age)throws InvalidAgeforVoteException
	{
		if (age < 18 ) 
		{
			// raise exception
			throw new InvalidAgeforVoteException("\"Invalid For Vote\n\t\tPlease enter age Grater than 18\"");
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args)  
	{
		// throw / throws
		try 
		{
			isValidForVote(15);
		} catch (InvalidAgeforVoteException e) 
		{
			e.printStackTrace();
		}
		System.out.println("After isvalidforvote method");
	}
}