package DSA.BItManipulation;

import java.util.Scanner;

public class SETiThBIT {
    public static int Set(int n,int i){
        int bit=1<<i;

            return n|bit;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int I=s.nextInt();
        System.out.println(Set(n,I));
    }
}
