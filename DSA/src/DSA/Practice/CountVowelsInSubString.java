package DSA.Practice;

import java.util.ArrayList;

public class CountVowelsInSubString {
    public static int isvowel(String str){
        int count=0;
        for(char ch:str.toLowerCase().toCharArray()){

            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count++;
        }
        return count;
    }
    public static void main(String args[]){
        String str="My name is ranjit reddy";
        ArrayList<Integer> list=new ArrayList<>();
        String word[]=str.split(" ");
        for(int i=0;i<word.length;i++){
           list.add(isvowel(word[i]));
        }
        System.out.print(list);
    }
}
