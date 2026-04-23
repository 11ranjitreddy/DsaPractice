package DSA.Stack;

import java.util.*;
public class ReverseString1 {
    public static void reverse(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){//for(char ch:str.toCharArray()){stack.add(ch));}
            stack.add(str.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
        sb.append(stack.pop());}

        System.out.println( sb.toString());
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        reverse(str);
    }
}
