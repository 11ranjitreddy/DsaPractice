package DSA.Loops;

import java.util.*;
public class primenumber {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean isprime = false;
        if (n <= 1) {
            System.out.println("Not a Prime Number");
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isprime = false;

            }}
            if (isprime)
                System.out.println("primenumber");
            else
                System.out.println("not a prime number");
        }

    }
