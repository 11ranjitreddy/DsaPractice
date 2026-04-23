package DSA.String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length())
            return false;

        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);

    }
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        String s=ss.nextLine();
        String t=ss.nextLine();
        Anagram a=new Anagram();
        System.out.println(a.isAnagram(s,t));
    }
}
