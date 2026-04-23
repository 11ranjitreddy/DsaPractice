package DSA.SlidingWindow2;

import java.util.*;
public class MaxWindowSum {
    public static  int maxsum(int a[],int k){
        int windowsum=0;
        int max;
        for(int i=0;i<k;i++)
            windowsum+=a[i];

        max=windowsum;

        for(int j=k;j<a.length;j++){
            windowsum+=a[j];
            windowsum-=a[j-k];
            max=Math.max(max,windowsum);
        }
        return max;
    }
    public  static void main(String args[]){
        int a[]={2,1,5,1,3,2};
        int k=3;
        System.out.println(maxsum(a,k));
    }
}
