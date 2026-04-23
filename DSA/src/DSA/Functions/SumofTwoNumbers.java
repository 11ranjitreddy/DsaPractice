package DSA.Functions;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void sum(int a,int b){
        Scanner s=new Scanner(System.in);
         a=s.nextInt();
         b=s.nextInt();

         int sum=a+b;
         System.out.println(sum);
    }
    public static void main(String args[]){
        sum(0,0);
    }
}
