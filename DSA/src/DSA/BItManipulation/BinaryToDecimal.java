package DSA.BItManipulation;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int BD(int n){
        int deci=0;
        int pow=0;
        while(n!=0){
            int reminder=n%2;
                deci=deci+reminder*(int)Math.pow(2,pow);
                pow++;
                n/=10;
        }
        return deci;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(BD(n));
    }
}
