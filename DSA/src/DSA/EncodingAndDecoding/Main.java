package DSA.EncodingAndDecoding;

import java.util.*;

public class Main{
    public static void main(String args[]){
        String str="Ranjitreddy";

        String str1="";
        for(int i=str.length()-1;i>=0;i--)
            str1+=str.charAt(i);

        System.out.print(str1);
    }
}
