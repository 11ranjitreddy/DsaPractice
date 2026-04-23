package DSA.Functions;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int BD(int n){
        int pow=0;
        int deci=0;
        while(n!=0){
            int lastdigit=n%10;
            deci=deci+lastdigit*(int)Math.pow(2,pow);
            pow++;
            n/=10;
        }
        return deci;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Binary Number: ");
        int n=s.nextInt();
        System.out.println("Decimal Number for "+n+" is :"+BD(n));
    }
}
