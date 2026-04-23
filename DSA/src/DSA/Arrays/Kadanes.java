package DSA.Arrays;

import java.util.Scanner;

public class  Kadanes {
    public static void kdn(int num[]){
        int ms=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<num.length;i++){
            c+=num[i];

            if(c<=0){
                c=0;}
            ms=Math.max(c,ms);

        }
        System.out.println(ms);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=s.nextInt();
        kdn(a);
    }
}
