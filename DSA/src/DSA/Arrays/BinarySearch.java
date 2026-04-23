package DSA.Arrays;

import  java.util.*;

public class BinarySearch {
    public static int binary(int a[],int key){

        int start=0,end=a.length;

        while(start<=end){
            int mid=(start+end)/2;

            if(a[mid]==key){
                return mid;
            }else if(a[mid]<key){
                start=mid+1;
            }else
                end=mid-1;
        }
        return -1;
    }
    public static void main(String args[]){

         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
             a[i]=s.nextInt();
         System.out.println("enter the key");
         int key=s.nextInt();

         System.out.println("element found at "+binary(a,key));
    }
}
