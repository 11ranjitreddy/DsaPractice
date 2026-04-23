package DSA.Arrays;

import java.util.*;

public class FactorsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i < n; i++) {
            int temp = i;
            int count = 0;

            for (int j = 1; j <= temp; j++) {
                if (temp % j == 0) {
                    count++;
                }
            }

            if (count >= 9) {
                System.out.print(temp + " ");
                total++;
            }
        }

        System.out.println("\nTotal = " + total);
    }
}


