package DSA.Arrays;

import java.util.Scanner;

public class PrefixSum {
    public static void prefix(int num[]){
        int current=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];

        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++) {
               // current = i==0? prefix[j]: prefix[j]-prefix[i-1];
                if(i==0)
                    current=prefix[j];
                else
                    current=prefix[j]-prefix[i-1];

                if(max<current){
                    max=current;}
            }
        }
        System.out.println(+max);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements: ");
        for(int i=0;i<a.length;i++)
            a[i]=s.nextInt();
        System.out.println("Max Sum is: ");
        prefix(a);

    }
}
