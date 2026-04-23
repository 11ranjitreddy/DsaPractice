package DSA.Arrays;

import java.util.Scanner;

public class PrintSubarrays {
    public static void subarray(int a[]){
        int ts=0;
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i;j<a.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(a[k]+" ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        subarray(a);
    }

}
