package DSA.Practice;

import java.util.Scanner;

public class BreakKeyword {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        do{
            System.out.println("Enter the number");
            int n=s.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while (true);
    }
}
