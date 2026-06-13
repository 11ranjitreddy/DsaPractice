package DSA.OOPs;

import  java.util.*;
public class AccessModifier {
    public static void main(String args[]){
        AccessModifier AM=new AccessModifier();
        Bank b=AM.new Bank();

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name =s.next();
        System.out.println("Enter the Accout_Number: ");
        int acc=s.nextInt();
        b.setName(name);
        b.setAccNumber(acc);
        System.out.println(b.getName());
        System.out.println(b.getAccNumber());
    }
    class Bank{
        public String name;
        private int AccNumber;

        public void setName(String name) {
            this.name = name;
        }
        public String getName(){
            return name;
        }

        public void setAccNumber(int AccNumber){
            this.AccNumber=AccNumber;
        }
        public int getAccNumber(){
            return AccNumber;
        }


    }
}
