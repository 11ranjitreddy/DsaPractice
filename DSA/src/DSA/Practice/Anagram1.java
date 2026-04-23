package DSA.Practice;

import java.util.Arrays;

public class Anagram1 {
    public  static boolean isanagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        char ch[]=a.toCharArray();
        char ch1[]=b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        return Arrays.equals(ch,ch1);
    }

    public static void main(String args[]){
        String a="Ranjit";
        String b="Rnajit";
        System.out.print(isanagram(a,b));

    }
}
