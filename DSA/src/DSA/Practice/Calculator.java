package DSA.Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        char c=s.next().charAt(0);

        switch (c){
            case '+': System.out.println(a+b);break;
            case '-': System.out.println(a-b);break;
            case '/':System.out.println(a/b);break;
            case '%':System.out.println(a%b);break;
            default:System.out.println("Enter a valid operator");

        }

    }
}
