package DSA.BItManipulation;

import java.util.Scanner;

public class GETiTHBIT {
    public static int get(int n,int i){
        int bit=1<<i;
        if((n&bit)!=0)
            return 1;
        else
            return 0;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int I=s.nextInt();
        System.out.println(get(n,I));
    }
}
