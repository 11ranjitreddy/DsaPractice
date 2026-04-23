package DSA.Arrays;

import java.util.Scanner;

public class Reverse {

    public static void reve(int num[]){
        int start=0,last=num.length-1;
        while(start<last){
            int temp=num[last];
            num[last]=num[start];
            num[start]=temp;

            start++;
            last--;
        }

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=s.nextInt();
        reve(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
