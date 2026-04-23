package DSA.String;

import java.util.*;

public class Anagram1 {
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length())return false;

        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();

        System.out.println(isAnagram(str1,str2));
    }
}
