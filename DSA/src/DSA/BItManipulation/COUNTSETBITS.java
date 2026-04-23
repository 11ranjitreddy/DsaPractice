package DSA.BItManipulation;

import java.util.Scanner;

public class COUNTSETBITS {
    public static int count(int n){
        int count=0;
        while((n!=0)){
            if((n&1)!=0) {
                count++;
            }
           n= n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(count(n));
    }
}
