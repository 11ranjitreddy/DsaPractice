package DSA.RECURSION;

import java.util.Scanner;

public class DigitAppears {

    public static int apper(int a[],int v,int i){
        int count=0;
        if(i==a.length){
            return 0;
        }
        if(a[i]==v){
            count++;
        }
        return count+apper(a,v,i+1);
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int v=s.nextInt();
        System.out.println(apper(a,v,0));
    }
}
