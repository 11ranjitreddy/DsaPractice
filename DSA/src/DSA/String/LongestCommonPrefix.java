package DSA.String;

import java.util.*;
public class LongestCommonPrefix {
    public static String longestprefix(String[] strs){
        if(strs==null || strs.length==0){
            return "";
        }
        int index=0;
        String result="";

        while(true){
            char ch=strs[0].charAt(index);

            if(index>=strs[0].length())
                break;

            for(int i=1;i<strs.length;i++){
                if(index>=strs[i].length()|| strs[i].charAt(index)!=ch){
                   return result;
                }
            }
            result+=ch;
            index++;
        }

        return result;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String strs[]={"flower","flow","flight"};
        System.out.print(longestprefix(strs));

    }
}
