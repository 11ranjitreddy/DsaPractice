package DSA.Functions;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        fact(n);
        System.out.println(+fact(n));
    }

}
