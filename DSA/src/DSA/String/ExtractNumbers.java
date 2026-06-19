package DSA.String;

import  java.util.*;
public class ExtractNumbers {
    public static void main(String args[]){
        String str="abc123xyz456";

        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch))
                sb.append(ch);
            else if(Character.isLetter(ch))
                sb1.append(ch);

        }
        System.out.println(sb);
        System.out.println(sb1);
    }
}
