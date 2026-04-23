package DSA.Functions;

import java.util.Scanner;

public class CountPrimeNumbers {
    public static int prime(int num){
        int count=0;

        for(int i=2;i<=num;i++){
            boolean isprime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i+" ");
                count++;
        }}
        return count;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=s.nextInt();
        System.out.println("Total prime numbers:" +prime(num));
    }
}
