import java.util.Scanner;

public class student 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        StudentData d[] = new StudentData[2];

        for(int i=0;i<d.length;i++)
        {
            d[i] = new StudentData();
            System.out.println("Enter name");
            String name = inp.nextLine();
            System.out.println("Enter rollno");
            inp.nextLine();
            int roll = inp.nextInt();
            d[i].input(name,roll);
        }
        for (StudentData studentData : d) 
        {
            studentData.dis();
        }
    }
}

class StudentData{

    private String name;
    private int rollno;
    static String school = "DPS";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        StudentData.school = school;
    }

    void input(String name,int rollnoo){
        this.name = name;
        this.rollno = rollnoo;
    }

    void dis(){
        System.out.println("Name: "+name+"\tRoll No:"+rollno);
    }
}
