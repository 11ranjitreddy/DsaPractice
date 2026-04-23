package DSA.Arrays2D;

import java.util.Scanner;

public class Diagnoal {
//    public static int diag(int num[][]){
//        int sum=0;
//
//        for(int i=0;i<num.length;i++){
//            for(int j=0;j<num[0].length;j++){
//                if(i==j) {
//                    sum += num[i][j];
//                }else if(i+j==num.length-1){
//                    sum+=num[i][j];
//                }
//            }
//        }
//        return sum;
//    }
    public static int diag(int num[][]){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i][i];
            if(i!=num.length-1-i)
                sum+=num[i][num.length-i-1];
        }
        return sum;
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
        System.out.println(diag(matrix));

    }
}
