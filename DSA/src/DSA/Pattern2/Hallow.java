package DSA.Pattern2;

import java.util.*;
public class Hallow {
    public static void hallow(int n,int m) {
        for (int i = 1; i <= n; i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || j==m || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        hallow(n,m);
    }

}
