package DSA.Arrays2D;

import java.util.Scanner;

public class SimpleMatrix {
    public static boolean Matrix(int num[][],int key){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(num[i][j]==key){
                    System.out.println("Element found at index: ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int n=s.nextInt();
        System.out.println("Enter the Number of Columns: ");
        int m=s.nextInt();

        System.out.println("Enter the Elements: ");
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("Enter the key");
        int k=s.nextInt();
        Matrix(matrix,k);
    }
}
