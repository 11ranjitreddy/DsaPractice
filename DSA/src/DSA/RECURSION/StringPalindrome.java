package DSA.RECURSION;

import java.util.Scanner;

public class StringPalindrome {
    public static boolean ispalindrome(String str,int l,int r){
        if(l>=r){
            return true;
        }
        if(str.charAt(l)!=str.charAt(r)){
            return false;
        }
        return ispalindrome(str,l+1,r-1);
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(ispalindrome(str,0,str.length()-1));
    }

}
