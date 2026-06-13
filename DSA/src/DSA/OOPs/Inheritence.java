package DSA.OOPs;

public class Inheritence {
    public static void main(String args[]){
        Pet p=new Pet();
        p.eat();;
        p.bar();;
        p.sleep();
    }
    static class Animal{
        void sleep(){
            System.out.println("sleeping");
        }
    }
    static class Dog extends Animal{
        void bar(){
            System.out.println("Dog is barking");
        }
    }
    static  class Pet extends Dog{
        void eat(){
            System.out.println("Eating");
        }
    }
}
