package innerclasstopic.ai;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Animal animal = new Animal() 
		{
			@Override
			public void eat() 
			{
				System.out.println("Cat -- eat() -- " + this);
			}
		};
		animal.eat();
	}
}
