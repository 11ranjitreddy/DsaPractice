package DSA.Arrays;

import java.util.Scanner;

public class NumSum {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]=s.nextInt();}
    int b[]=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            int t=a[i];
            int x=t;
        while(x!=0){
            int digit=x%10;
            sum+=digit;
            x/=10;
        }
        if(sum==2){
            b[i]=t;
        }

        }
        for (int i=0;i<n;i++){
            System.out.println(b[i]);
        }

    }
}
