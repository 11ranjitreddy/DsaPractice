package DSA_DAY_PRACTICE;

import java.util.Arrays;

public class Day5_Valid_Anagram {
    public static boolean isvalid(String s,String t){
        if(s.length()!=t.length())return false;

        s=s.toLowerCase();
        t=t.toLowerCase();
        char a[]=s.toCharArray();
        char b[]=s.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
    public static void main(String args[]){
        String s = "anagram", t = "nagaram";
        System.out.print(isvalid(s,t));
    }
}
