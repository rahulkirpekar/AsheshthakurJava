package collectionfrm.listtopic.al;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentList 
{
    StudentList(){

    }
    static ArrayList<StudentData> list = new ArrayList<StudentData>();

    static Scanner sc = new Scanner(System.in);

    public void insertStudentRecord() {
        StudentData data = new StudentData();
        data.scan();
        list.add(data);
    } //insert

    public void updateStudent(int id) {
        Iterator<StudentData> iter = list.iterator();
        while (iter.hasNext()) {
            StudentData obj = (StudentData) iter.next();

            if (obj.update(id) == id) {
                StudentData update = new StudentData();
                update.scan();
                list.set(list.indexOf(obj), update);
            } else {
                System.out.println("The update can not be possible at this time!");
            }
        }
    } //update

    public void removeStudent(int id) {
        Iterator<StudentData> iter = list.iterator();
        while (iter.hasNext()) {
            StudentData obj = (StudentData) iter.next();

            if (obj.remove(id) == id) {
                list.remove(list.indexOf(obj));
            } else {
                System.out.println("The removal can not be possible at this time!");
            }
        }
    } //remove

    public void displayAll() {
        System.out.println("ID    " + " " + "NAME   " + "" + "STD");
        Iterator<StudentData> iter = list.iterator();
        while (iter.hasNext()) {
            StudentData obj = (StudentData) iter.next();
            obj.display();
        }
    } //disp

    public static void main(String[] args) 
    {
    	StudentList lst = new StudentList();
        while(true) {
            System.out.println("1. to add student");
            System.out.println("2. to update student");
            System.out.println("3. to remove student");
            System.out.println("4. display all students");
            System.out.println("5. search student");
            System.out.println("0. Exit ");
            int choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    lst.insertStudentRecord();
                    break;
                case 2:
                    System.out.println("Enter sutdent id to update");
                    int id = sc.nextInt();
                    lst.updateStudent(id);
                    break;
                case 3:
                    System.out.println("Enter sutdent id to remove");
                    int i = sc.nextInt();
                    lst.removeStudent(i);
                    break;
                case 4:
                    lst.displayAll();
                    break;
                case 5:
                    break;
                case 0:
                    System.exit(0);
            } //switch
        } //while
    } //main

} //class

