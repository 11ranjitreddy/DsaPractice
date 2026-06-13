package DSA.OOPs;

public class RunTimePolymorhphis {
    public static void main(String args[]) {
   Bike b=new Bike();
   b.sound();
    }

    static class Car {
        void sount() {
            System.out.println("Car sound");
        }

    }

    static class Bike extends Car {
        void sound() {
            System.out.println("BIke sound");
        }
    }
}