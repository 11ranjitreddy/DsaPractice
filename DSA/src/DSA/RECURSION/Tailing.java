package DSA.RECURSION;

import java.util.Scanner;

public class Tailing {
    public static int tail(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=tail(n-1);
        int fnm2=tail(n-2);
        int total=fnm1+fnm2;

        return total;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
System.out.println(tail(n));
    }
}
