package DSA.BItManipulation;

import java.util.Scanner;

public class CLEARiTHBIT {
    public static int Clear(int n,int i){
        int bit=~1<<i;
        return n&bit;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int I=s.nextInt();
        System.out.println(Clear(n,I));
    }
}
