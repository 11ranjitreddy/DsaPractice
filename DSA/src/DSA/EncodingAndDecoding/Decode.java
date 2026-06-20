package DSA.EncodingAndDecoding;

import  java.util.*;
public class Decode {
    public static void main(String args[]){
        String str="bcd";
        String decode="";
        for(char ch:str.toCharArray()){
            decode+=(char)(ch-1);
        }
        System.out.print(decode);
    }
}
