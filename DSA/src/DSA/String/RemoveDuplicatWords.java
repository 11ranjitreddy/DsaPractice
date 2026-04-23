package DSA.String;

import java.util.*;
public class RemoveDuplicatWords {
    public static void main(String args[]){
        String str="My name is is ranjit";
        StringBuilder sb=new StringBuilder();
        String word[]=str.split(" ");

        for(int i=0;i<word.length;i++){
            boolean isduplicate=false;

            for(int j=0;j<i;j++){
                if(word[j].equals(word[i])){
                    isduplicate=true;
                    break;
                }
            }
            if(!isduplicate)
                sb.append(word[i]).append(" ");
        }
        System.out.print(sb.toString());
    }
}
