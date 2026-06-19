package DSA.Oops2;

import java.util.*;
public class Encapsulation {
    public  static  void main(String args[]){
      Scanner s=new Scanner(System.in);
      Student ss=new Student();
      System.out.println("Enter the Student Name: ");
      String name=s.next();
      ss.setName(name);
      System.out.println("Enter the Student Age: ");
      int age=s.nextInt();
      ss.setAge(age);

      System.out.println(ss.getName());
      System.out.println(ss.getAge());
      ss.print();
    }
}

class  Student{
    private String name;
    private  int age;
    void print(){
        System.out.println(name+" "+age);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return  age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
