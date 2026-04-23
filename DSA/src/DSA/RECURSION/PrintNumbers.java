package DSA.RECURSION;

import java.util.Scanner;

public class PrintNumbers {
    public static void printt(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printt(n-1);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printt(n);
    }
}
