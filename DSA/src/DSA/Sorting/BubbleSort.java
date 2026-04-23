package DSA.Sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void sort(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++)
            System.out.print(num[i]+" ");

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        sort(a);
    }

}
