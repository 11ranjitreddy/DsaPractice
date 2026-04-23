package DSA.Practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean isprime=true;
        for (int i=2;i<=n-1;i++){
            if(n%i==0)
                isprime=false;
        }
        if(isprime){
            System.out.println("Prime number");
        }else
            System.out.println("Not a prime number");
    }
}
