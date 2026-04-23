package DSA.Arrays;

import java.util.Scanner;

public class MaxSubarray {

    public static void subarray(int num[]){
        int current=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                current=0;
                for(int k=start;k<=end;k++){
                    current+=num[k];
                }

                if(max<current)
                    max=current;

            }
        }
        System.out.println(max);
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
