package DSA.String;

import java.util.*;
public class LongesWord {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        String words[]=str.split(" ");
        String longest="";

        for(String w:words){
            if(w.length()>longest.length()){
                longest=w;
            }
        }
        System.out.println(longest);
    }
}
