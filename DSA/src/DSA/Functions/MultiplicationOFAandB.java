package DSA.Functions;

import java.util.Scanner;

public class MultiplicationOFAandB {
    public static int mul(int a,int b){
        int multi= a*b;
        return multi;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        System.out.print("Multiplication is: "+mul(a,b));

    }
}
