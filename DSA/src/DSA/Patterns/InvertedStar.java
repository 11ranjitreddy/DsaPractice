package DSA.Patterns;

import java.util.Scanner;

public class InvertedStar {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the no of lines: ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
