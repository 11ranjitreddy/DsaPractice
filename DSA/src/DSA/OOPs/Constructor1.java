package DSA.OOPs;

import  java.util.*;

public class Constructor1 {
    public static  void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name=s.next();
        System.out.println("Enter the Age: ");
        int age =s.nextInt();
        System.out.println("Enter the ID: ");
        int id=s.nextInt();

        Student ss=new Student(name,age,id);
        ss.display();
    }
    static class Student{
        String Name;
        int age;
        int id;
        Student(String Name,int age,int id){
            this.Name=Name;
            this.age=age;
            this.id=id;
        }
        void display(){
            System.out.println("Student Name"+Name+" AGE: "+age+" Id "+id);
        }
    }
}
