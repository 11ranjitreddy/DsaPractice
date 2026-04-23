package DSA.Arrays;

import java.util.*;
public class Container {
    public static int most(int a[]){
        int left=0;
        int right=a.length-1;
        int max=0;
        while(left<right){
            int height=Math.min(a[left],a[right]);
            int width=right-left;
            max=Math.max(max,height*width);

            if(a[left]<a[right])
                left++;
                else
            right--;
        }
        return max;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();

        System.out.println(most(a));
    }
}
