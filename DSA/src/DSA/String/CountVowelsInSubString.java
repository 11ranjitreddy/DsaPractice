package DSA.String;

import java.util.*;
public class CountVowelsInSubString {
    public static int countvowels(String str){
        str=str.toLowerCase();
        int count=0;
        for(char x:str.toCharArray()){
            if(x=='a' || x=='e' || x=='i' || x== 'o'|| x=='u')
                count++;
        }
        return count;
    }


    public static void main(String args[]){
        String str="my name is ranjit";
        String word[]=str.split(" ");
        ArrayList<Integer>list =new ArrayList<>();
        for(int i=0;i<word.length;i++){
         list.add(countvowels(word[i]));
        }
        System.out.println(list);
        }
    }


