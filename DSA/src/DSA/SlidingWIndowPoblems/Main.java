package DSA.SlidingWIndowPoblems;

import java.util.*;

public class Main{
    public static void main(String args[]){
        int a[]={12 ,-1, -7, 8, -15, 30, 16, 28};
        int k=3;
        int count=0;
        int n=a.length;
        for(int i=0;i<k;i++){
            if(a[i]<0)
                count++;
        }
        System.out.println(count);
        for(int i=k;i<n;i++){
            count=0;
            for(int j=i-k+1;j<=i;j++){
                if(a[j]<0)
                    count++;
            }
            System.out.println(count);
        }
    }
}