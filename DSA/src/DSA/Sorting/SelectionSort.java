package DSA.Sorting;

import java.util.Scanner;

public class SelectionSort {

    public static void select(int num[]){
        for(int i=0;i<num.length;i++){
            int min=i;
            for(int j=i+1;j<num.length;j++){
                if(num[min]>num[j]){
                    min=j;
                }
            }
            int temp=num[min];
            num[min]=num[i];
            num[i]=temp;
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
        select(a);
    }
}
