package DSA.RECURSION;

import java.util.Scanner;

public class Sorted {
    public static boolean issorted(int a[],int i){
       if(i==a.length-1){
           return true;
       }
        if(a[i]>a[i+1]){
            return false;
        }
        return issorted(a,i+1);

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
System.out.println(issorted(a,0));
    }
}
