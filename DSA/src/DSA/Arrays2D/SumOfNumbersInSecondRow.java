package DSA.Arrays2D;

import java.util.Scanner;

public class SumOfNumbersInSecondRow {

    public static void second(int num[][]){
        int sum=0;
       for(int j=0;j<num.length;j++){
           sum+=num[1][j];
       }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int matrix[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        second(matrix);
    }

}
