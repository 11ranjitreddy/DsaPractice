package DSA.String;

import java.util.*;
public class ToggleCase {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else
                sb.append(Character.toUpperCase(ch));
        }

        System.out.println( sb);
    }

}
