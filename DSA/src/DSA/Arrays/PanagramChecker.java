package DSA.Arrays;

import java.util.Scanner;

public class PanagramChecker {
    public static boolean isPangram(String s) {
        boolean[] seen = new boolean[26];
        int count = 0;
        s = s.toLowerCase();
        for (int i =0; i<s.length();i++) {
            char c=s.charAt(i);
            if (c>='a' && c<='z') {
                int idx =c-'a';
                if (!seen[idx]) {
                    seen[idx] = true;
                    count++;
                    if (count == 26) return true;
                }
            }
        }
        return count == 26;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String line = sc.nextLine();
        boolean result = isPangram(line);
        System.out.println(result ? "Pangram" : "Not a pangram");
        sc.close();
    }
}

