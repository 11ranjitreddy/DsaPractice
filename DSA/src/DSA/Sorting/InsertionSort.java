package DSA.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insert(int num[]){
        for(int i=1;i<num.length;i++){
            int current=num[i];
            int prev=i-1;
            while(prev>=0 && num[prev]>current){
                num[prev+1]=num[prev];
                prev--;
            }
            num[prev+1]=current;
        }
        for(int i=0;i<num.length;i++)
        System.out.println(num[i]+" ");
    }
    public static  void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        insert(a);
    }
}
