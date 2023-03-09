package stringtopic.stringequality;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 = "rahul";
		String name2 = "rahul";
		System.out.println("name1==name2 : " + (name1==name2));//  references
		System.out.println("name1.equals(name2) : " + name1.equals(name2));// values

		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "ashesh", 12);
		Student s3 = s1;
		
		
		System.out.println("s1==s2 : " + (s1==s2));// false
		System.out.println("s1==s3 : " + (s1==s3));// false
		
		System.out.println("s1.equals(s2) : " + (s1.equals(s2)));// 
		System.out.println("s1.equals(s3) : " + (s1.equals(s3)));// 
		
		
	}
}
