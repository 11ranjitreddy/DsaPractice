package DSA.DivideAndConqure;

import java.util.*;
public class QuickSort {
    public static void main(String args[]){
        int a[]={6,3,9,5,2,8};
        quicksort(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]+" ");
    }
    public static void quicksort(int a[],int low,int high){
        if(low<high){
            int pivotindex=partition(a,low,high);
            quicksort(a,low,pivotindex-1);
            quicksort(a,pivotindex+1,high);
        }
    }
    public static int partition(int a[],int low,int high){
        int pivot=a[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                i++;

                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;

        return i+1;
    }
}
