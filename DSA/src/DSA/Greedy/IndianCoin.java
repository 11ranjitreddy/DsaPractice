package DSA.Greedy;

import java.util.*;
public class IndianCoin {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();

        int Indiancoin=s.nextInt();
        Arrays.sort(a);
        reverse(a);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int coins:a){
            while(Indiancoin>=coins){
                Indiancoin-=coins;
                ans.add(coins);

            }
        }
        System.out.print(ans.size());
    }
    public static void reverse(int a[]){
        int left=0;
        int right=a.length-1;
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
}
