package DSA.Oops2.Encapsulation.Polymorphism;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        Calc cc=new Calc(a,b,c);
        cc.sum(a,b);
        cc.sum(a,b,c);

    }
}
class Calc{
    int a;
    int b;
    int c;
    Calc(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}