package DSA.RECURSION;

import java.util.Scanner;

public class LastOccurence {
    public static int last(int a[],int key,int i){
        if(i==0){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return last(a,key,i-1);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int key=s.nextInt();
        System.out.println(last(a,key,n-1));
    }
}
