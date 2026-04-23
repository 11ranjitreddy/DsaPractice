package DSA.SlidingWIndowPoblems;

import java.util.*;
public class MaximumElementInEveryWindow {
    public static void main(String args[]){
        int a[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int n=a.length;
        for(int i=0;i<=n-k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                if(a[j]>max)
                    max=a[j];
            }
            System.out.print(max+" ");
        }
    }
}
