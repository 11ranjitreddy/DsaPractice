package DSA.Functions;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
return isprime;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to check isprime of Not: ");
        int n=s.nextInt();

        if(isprime(n))System.out.println("Prime number");
        else System.out.println("Not a prime number");
    }
}
