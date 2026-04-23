package DSA.Arrays2D;

import java.util.*;

public class UniquePath {

    public static int unique(int n,int m){
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
            a[i][0]=1;
        for(int j=0;j<m;j++)
            a[0][j]=1;

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                a[i][j]=a[i-1][j]+a[i][j-1];
            }
        }
        return a[n-1][m-1];
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
System.out.println(unique(n,m));


    }
}
