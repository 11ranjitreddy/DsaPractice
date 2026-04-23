package DSA_DAY_PRACTICE;

public class Day2_Best_TimetoBuy_Stock {

    public static int buy(int a[]){
        int buy=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                int profit=a[i]-max;
                buy=Math.max(profit,buy);
            }else{
                max=a[i];
            }
        }
        return buy;
    }
    public static void main(String args[]){
        int a[]={7,1,5,3,6,4};
        System.out.print(buy(a));
    }
}
