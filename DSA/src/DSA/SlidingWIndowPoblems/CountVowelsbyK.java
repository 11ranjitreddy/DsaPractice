package DSA.SlidingWIndowPoblems;

import java.util.*;
public class CountVowelsbyK {

public static boolean isvowel(char ch){
    return ch=='a'|| ch=='e' || ch=='i' || ch=='o'||ch=='u';
}

    public static void main(String args[]){
        String str="abciiidef";
        int k=3;
        for(int i=0;i<=str.length()-k;i++){
         int count=0;
         for(int j=i;j<i+k;j++){
             if(isvowel(str.charAt(j)))
                 count++;
         }
         System.out.print(count+" ");
        }
    }
}
