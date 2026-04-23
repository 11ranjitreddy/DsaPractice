package DSA.BItManipulation;

import java.util.Scanner;

public class EvenOrOdd {
    public static void check(int n){
        int bit=1;
        if((n & bit)==0)
            System.out.println("Even");
        else
            System.out.println("ODD");
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        check(n);
    }
}
