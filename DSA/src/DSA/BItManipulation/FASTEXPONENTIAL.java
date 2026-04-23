package DSA.BItManipulation;

import java.util.Scanner;

public class FASTEXPONENTIAL {
    public static int expo(int n,int e){
        int ans=1;
                while(e!=0){
                    if((e&1)!=0){
                        ans=ans*n;
                    }
                    n=n*n;
                    e=e>>1;
                }
                return ans;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int e=s.nextInt();
        System.out.println(expo(n,e));
    }
}

