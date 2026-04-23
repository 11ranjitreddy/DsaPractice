package DSA.Practice;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int income = s.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income <= 100000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }

        System.out.println("Tax is : " + tax);

    }
}