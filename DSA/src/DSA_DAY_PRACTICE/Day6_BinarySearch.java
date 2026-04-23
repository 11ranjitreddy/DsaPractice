package DSA_DAY_PRACTICE;

public class Day6_BinarySearch {

    public static int search(int a[],int target){
        int left=0;
        int right=a.length-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(a[mid]==target)
                return mid;
            else if( a[mid]>target)
                right=mid-1;
                else
                    left=mid+1;


        }
        return -1;
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7};
        int target=2;
        System.out.print(search(a,target));
    }
}
