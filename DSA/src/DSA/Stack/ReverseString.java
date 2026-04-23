package DSA.Stack;

import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Stack<Character> stack=new Stack<>();
        String str=s.nextLine();
        for(char ch:str.toCharArray()){
            stack.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}
