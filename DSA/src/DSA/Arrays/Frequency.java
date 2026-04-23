package DSA.Arrays;

import java.util.Scanner;

public class Frequency {

    public static void freq(int num[]){
        int count=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j])
                    count++;
            }
        }
        if(count>=1)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
    public static void main(String  args[]){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=s.nextInt();
        freq(a);
    }
}
