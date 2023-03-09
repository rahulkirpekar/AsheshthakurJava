package stringtopic.stringequality;

public class Student 
{
	int rno;
	String name;
	int std;
	public Student(int rno, String name, int std) {
		super();
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	
	public void disp() 
	{
		System.out.println(rno + " " + name + " "+ std);
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		Student s2 = (Student)obj;
		return (std==s2.std);
	}
}
