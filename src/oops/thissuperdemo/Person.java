package oops.thissuperdemo;

public class Person 
{
	private String name;

	public Person() 
	{
		System.out.println("Default --Person Constructor");
	}
	public Person(String name)
	{
		this();
		System.out.println("Person -- Para Constructor");
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}
}
