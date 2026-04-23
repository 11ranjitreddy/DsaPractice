package DSA.BackTracking;

import java.util.Scanner;

public class SubsetSum {
    static int count=0;
     public static void sum(String str,int k,int i,int sum){
         if(i==str.length()){
             if(sum==k){
                 System.out.println(sum);
                 count++;
             }
             return;
         }
         int val=str.charAt(i)-'0';
         sum(str,k,i+1,sum+val);
         sum(str,k,i+1,sum);
     }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        String str=s.nextLine();
        System.out.print("Enter the Target: ");
        int k=s.nextInt();
        sum(str,k,0,0);
        System.out.println(count);
    }
}
