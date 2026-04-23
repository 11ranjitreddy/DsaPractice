package DSA.Arrays;

import java.util.Scanner;

public class Pairs {

//    public static void pairs(int num[]){
//        for(int i=0;i<num.length;i++){
//
//        }
//    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();

        for(int i=0;i<a.length;i++){
            int current=a[i];
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+current+","+a[j]+")");
            }
            System.out.println();
        }
    }

}
