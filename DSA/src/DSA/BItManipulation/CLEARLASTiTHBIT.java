package DSA.BItManipulation;

import java.util.Scanner;

public class CLEARLASTiTHBIT {
    public static int clear(int n,int i){
        int bit=~0<<i;
      return n&bit;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int I=s.nextInt();
        System.out.println(clear(n,I));
    }
}
