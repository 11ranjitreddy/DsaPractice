package DSA.OOPs;

import java.util.*;

public class MainInputBased {
    public static void main(String args[]){
        Pen p=new Pen();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the colour name:");
        String colour=s.next();
        p.PrintPenColour(colour);
        System.out.println(p.colour);

        System.out.println("Enter the StudentName: ");
        String name=s.next();
        System.out.println("Enter the Student ID: ");
        int id=s.nextInt();
        System.out.println("Enter the Student Age: ");
        int age=s.nextInt();

        Student ss=new Student();
        ss.info(name,id,age);
        System.out.println(ss.name);
        System.out.println(ss.age);
        System.out.println(ss.id);

    }

    static class Pen{
        String colour;
        void PrintPenColour(String colour){
            this.colour=colour;
        }
    }
    static class Student{
        String name;
        int id;
        int age;
        void info(String name,int id,int age){
            this.id=id;
            this.name=name;
            this.age=age;
        }
    }
}
