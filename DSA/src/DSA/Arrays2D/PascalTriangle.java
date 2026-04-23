package DSA.Arrays2D;

import java.util.*;
public class PascalTriangle {
    public  static  void pascal(int n){
        int t[][]=new int[n][n];
        for(int i=0;i<n;i++){
            t[i][0]=1;
            t[i][i]=1;

            for(int j=1;j<i;j++){
                t[i][j]=t[i-1][j-1]+t[i-1][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        pascal(n);
    }

}
