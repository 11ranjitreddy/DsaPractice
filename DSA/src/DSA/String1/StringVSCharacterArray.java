package DSA.String1;
import java.util.*;
public class StringVSCharacterArray {
    public static void main(String args[]){
    String str="Ranjit Reddy";
    char a[]=str.toCharArray();

    for(char ch:a){
        System.out.print(ch+" ");
    }
    String s2=new String(a);
    System.out.print(str);
}}
