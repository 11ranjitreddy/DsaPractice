package DSA.Arrays2D;

import java.util.Scanner;

public class PrintElement {

    public static void print(int num[][],int n,int m,int element){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(element==num[i][j]){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n=s.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int m=s.nextInt();

        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        System.out.print("Enter the element : ");
        int e=s.nextInt();
        print(matrix,n,m,e);
    }
}
