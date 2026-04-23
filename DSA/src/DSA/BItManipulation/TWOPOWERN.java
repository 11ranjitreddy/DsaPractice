package DSA.BItManipulation;

import java.util.Scanner;

public class TWOPOWERN {
    public static boolean ispoweroftwo(int n){
        if((n&n-1)==0)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(ispoweroftwo(n));
    }
}
