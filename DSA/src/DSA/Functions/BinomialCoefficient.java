package DSA.Functions;

import java.util.Scanner;

public class BinomialCoefficient {
    public static void bino(int n,int r){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        int rr=1;
        for(int i=1;i<=r;i++){
            rr*=i;
        }
        int sub=n-r;
        int fina=1;
        for(int i=1;i<=sub;i++){
            fina*=i;
        }

        int state=fact/(rr*sub);
        System.out.println(state);

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the N: ");
        int n=s.nextInt();
        System.out.println("Enter the R:");
        int r=s.nextInt();

       bino(n,r);

    }
}
