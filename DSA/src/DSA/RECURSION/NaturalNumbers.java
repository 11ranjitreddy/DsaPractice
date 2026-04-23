package DSA.RECURSION;

import java.util.Scanner;

public class NaturalNumbers {
    public static int natural(int n){
        if(n==0)
            return 0;
        int N;
        return N=(n*(n+1))/2;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(natural(n));
    }
}
