package DSA.Arrays;

import java.util.Scanner;

public class Stock {
    public static void buy(int price[]){
        int buy=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<price.length;i++){
            if(buy<price[i]){
                int profit=price[i]-buy;
                max=Math.max(max,profit);
            }
            else
                buy=price[i];
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=s.nextInt();
        buy(a);
    }
}
