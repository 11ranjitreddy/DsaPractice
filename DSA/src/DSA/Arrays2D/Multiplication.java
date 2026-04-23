package DSA.Arrays2D;

import java.util.*;
public class Multiplication {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int r1=s.nextInt();
        int c1=s.nextInt();
        int r2=s.nextInt();
        int c2=s.nextInt();

        if(c1!=r2){
            System.out.println("Not Possible");
            return;
        }
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++) {
                b[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

      for(int i=0;i<r1;i++){
          for(int j=0;j<c2;j++){
              System.out.print(c[i][j]+" ");
          }
          System.out.println();
      }
    }
}
