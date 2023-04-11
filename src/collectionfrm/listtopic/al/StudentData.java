package collectionfrm.listtopic.al;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentData 
{
    private int id , std;
    private String name;

    Scanner sc =new Scanner(System.in);
    StudentData(){

    }
    public void display(){

        System.out.println(id+" "+name+" "+std);
    }

    public void searchById(int id){
        if(this.id == id){
            System.out.println(id+" "+name+" "+std);
        }
        else{
            System.out.println("The data does not exist");
        }
    }
    public void searchByName(String name){
        if(this.name == name){
            System.out.println(id+" "+name+" "+std);
        }
        else{
            System.out.println("The data does not exist");
        }
    }

    public void scan() {
        System.out.println("Enter Id");
        int id = sc.nextInt();
        this.id =id;
        System.out.println("Enter Name");
        String name  = sc.nextLine();
        this.name =name;
        System.out.println("Enter Std");
        int std = sc.nextInt();
        this.std =std;

    }

    public int update(int id) {
        if (this.id == id) {
            return id;
        } else {
            System.out.println("The data does not exist");
        }
        return 0;
    }

    public int remove(int id) {
        if (this.id == id) {
            return id;
        } else {
            System.out.println("The data does not exist");
        }
        return 0;
    }

}
