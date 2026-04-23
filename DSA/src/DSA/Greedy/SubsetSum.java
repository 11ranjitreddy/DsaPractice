package DSA.Greedy;

import java.util.*;
public class SubsetSum {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i] = s.nextInt();
        System.out.print(issum(a));
    }
    public static boolean issum(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++)
            sum+=a[i];
        if(sum%2!=0)return false;
        int target=sum/2;
        boolean dp[]=new boolean[target+1];
        dp[0]=true;

        for(int num:a){
            for(int s=target;s>=num;s--){
                dp[s]=dp[s]||dp[s-num];

            }
        }
        return dp[target];
    }

}