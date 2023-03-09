package oops.polydemo;

public class Dog extends Animal
{
	@Override
	public void eat() 
	{
		System.out.println("Dog- eatting food");
	}
	public static void main(String[] args) 
	{
		Dog d = (Dog)new Animal();
		d.eat();
	}
}
