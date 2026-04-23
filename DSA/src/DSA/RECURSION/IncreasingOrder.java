package DSA.RECURSION;

import java.util.Scanner;

public class IncreasingOrder {
    public static int increase(int n){
        if(n>=10){
            return 0;
        }
            System.out.println(n+" ");
        return increase(n+1);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        increase(n);
    }
}
