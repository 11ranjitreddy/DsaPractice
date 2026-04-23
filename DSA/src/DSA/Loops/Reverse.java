package DSA.Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rev;
        int sum=0;
        while(n!=0){
            rev=n%10;
            n/=10;
            System.out.print(rev);

        }
    }

}
