package oops;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setRno(1);
		s.setName("Rahul Kirpekar");
		s.setStd(12);
		
		System.out.println(s.getName() + " " + s.getStd());
	}
}
