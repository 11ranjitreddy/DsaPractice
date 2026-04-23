package DSA.String;

import java.util.Scanner;

public class Palindrome {

    public boolean ispalindrome(String p){
        int left=0;
        int right=p.length()-1;

        while(left<right){
            if(p.charAt(left)!=p.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String p=s.nextLine();
        Palindrome pp=new Palindrome();
        System.out.println(pp.ispalindrome(p));
    }
}
