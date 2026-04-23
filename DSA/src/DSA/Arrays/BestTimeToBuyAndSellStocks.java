package DSA.Arrays;

import java.util.Scanner;

public class BestTimeToBuyAndSellStocks {
    public static void Stock(int price[]){
        int buy=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++){
            if(buy<price[i]){
                int profit=price[i]-buy;
                maxprofit=Math.max(profit,maxprofit);
            }else
                buy=price[i];
        }
        System.out.println(maxprofit);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();

        Stock(a);

    }
}
