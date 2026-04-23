package DSA.OOPs;

import java.util.Scanner;

public class ClassAndObject {
    public static void main(String args[]){
//        Pen p=new Pen();
//        p.setColour("black");
//        p.setTip("50");
//        System.out.println(p.tip);
//        System.out.println(p.colour);
        Student s=new Student();
        s.setname("Ranjit");
        s.setAge("20");
        s.percentage(99,99,99);
        System.out.println(s.age);
        System.out.println(s.name);
        System.out.println(s.cgpa);
    }

}
//class Pen{
//    String colour;
//    String tip;
//    void setColour(String newColour){
//        colour=newColour;
//    }
//    void setTip(String newTip){
//        tip=newTip;
//    }
//}
class Student{
    String age;
    String name;
    float cgpa;
    void setname(String sname){
        name=sname;
    }
    void setAge(String aage){
        age=aage;
    }
    void percentage(float s1,float s2,float s3){
        cgpa=(s1+s2+s3)/3;
    }
}