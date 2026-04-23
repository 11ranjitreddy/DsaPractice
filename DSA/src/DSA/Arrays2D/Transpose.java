package DSA.Arrays2D;

import java.util.Scanner;

public class Transpose {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
        System.out.print(m[i][j]);
            }
            System.out.println();
        }

        System.out.println("Transpose: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(m[j][i]);
            }
            System.out.println();
        }
    }
}
