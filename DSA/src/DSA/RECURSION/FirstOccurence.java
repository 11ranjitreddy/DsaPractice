package DSA.RECURSION;

import java.util.Scanner;

public class FirstOccurence {
    public static int first(int a[],int key,int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return first(a,key,i+1);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int key=s.nextInt();
        System.out.println(first(a,key,0));
    }
}
