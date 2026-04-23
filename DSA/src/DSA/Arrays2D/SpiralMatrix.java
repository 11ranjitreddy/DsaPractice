package DSA.Arrays2D;

import java.util.Scanner;

public class SpiralMatrix {
    public static void spiral(int num[][]){
        int sr=0;
        int er=num.length-1;
        int sc=0;
        int ec=num[0].length-1;
System.out.println("Spiral Matrix is: ");
        while(sr<=er && sc<=ec){
            //Top
            for(int j=sc;j<=ec;j++) System.out.print(num[sr][j]+" ");
            //Right
            for(int i=sr+1;i<=er;i++) System.out.print(num[i][ec]+" ");
            //Bottom
            for(int j=ec-1;j>=sc;j--) {
                if(sr==er){break;
            }
                System.out.print(num[er][j]+" ");}
            //Left
            for(int i=er-1;i>=sr+1;i--) {
                if(sc==ec){
                    break;
                }
                System.out.print(num[i][sc]+" ");}

            sr++;
            er--;
            sc++;
            ec--;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number of Rows:");
        int n=s.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int m=s.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        spiral(matrix);

    }
}
