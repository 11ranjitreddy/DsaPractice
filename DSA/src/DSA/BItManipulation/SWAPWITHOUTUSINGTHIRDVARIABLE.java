package DSA.BItManipulation;

import java.util.Scanner;

public class SWAPWITHOUTUSINGTHIRDVARIABLE {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println(x+" "+y+" ");
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x+" "+y+" ");
    }
}
