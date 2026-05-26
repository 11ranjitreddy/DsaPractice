package DSA.OOPs;

public class Main {
    public static void main(String args[]){

        Main m=new Main();

        Pen p=m.new Pen();
        p.printclour("Red");

        Student s=m.new Student();
        s.info("Ranjit",20,30772);

        System.out.println(p.colour);
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.id);
    }

    class Pen{
        String colour;
        void printclour(String colour){
            this.colour=colour;
        }
    }

    class Student{
        String name;
        int age;
        double id;

        void info(String name,int age,double id){
            this.name=name;
           this.age=age;
           this.id=id;
        }
    }
}
