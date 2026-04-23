package DSA.BItManipulation;

import java.util.Scanner;

public class UPDATEiTHBIT {
    public static int clear(int n,int i,int newbit){
        int bit=~1<<i;
        return n&bit;
    }

    public static int set(int n,int i,int newbit){
        int bit=1<<i;
        return n|bit;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int I=s.nextInt();
        int newbit=s.nextInt();
        if(newbit==0)
            System.out.println(clear(n,I,newbit));
        else
            System.out.println(set(n,I,newbit));

    }
}
