package DSA.BItManipulation;

import java.util.Scanner;

public class CLEARiTHRANGEBITS {
    public static int clear(int n,int i,int j){

        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int c=a|b;
        return n&c;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int I=s.nextInt();
        int J=s.nextInt();
        System.out.println(clear(n,I,J));
    }
}
