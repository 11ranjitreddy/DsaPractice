package DSA.Practice;

import java.util.Scanner;

public class ContinueQuestion {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        do {
            System.out.println("Enter The Number");
            int n=s.nextInt();
            if(n%10==0){
                continue;
            } else if (n==7777) {
                break;
            }
            System.out.println(n);
            System.out.println("Enter 7777 to exit");
        }while (true);
    }
}
