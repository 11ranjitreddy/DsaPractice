package DSA_DAY_PRACTICE;

import DSA.Sorting.SelectionSort;

public class Day10_LinkedList_Cycle {

    public  static int search(int a[],int target){
        int left=0;
        int right=a.length-1;

        while (left<right){
            int mid=(left+right)/2;

            if(a[mid]==target)
                return mid;
            else if(a[mid]<target){
                left=mid+1;

            }
            else right=mid-1;
        }
        return -1;

    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7};
        int target=1;
        System.out.print(search(a,target));
    }
}
