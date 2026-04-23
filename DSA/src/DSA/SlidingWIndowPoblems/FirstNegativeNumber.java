package DSA.SlidingWIndowPoblems;

import java.util.*;
public class FirstNegativeNumber {
    public static void main(String args[]){
        int a[] = {1, 2, -1, 3, -12, 3, -4, 2, -6};

        int k=3;
        int n=a.length;
        for(int i=0;i<=n-k;i++){
            boolean found=false;
            for(int j=i;j<i+k;j++){
                if(a[j]<0){
                    System.out.print(a[j]+" ");
                    found=true;
                    break;
                }

                }
            if(!found){
                System.out.print("0");
            }
        }
    }

}
