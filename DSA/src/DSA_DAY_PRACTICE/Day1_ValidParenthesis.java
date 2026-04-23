package DSA_DAY_PRACTICE;

import java.util.*;
public class Day1_ValidParenthesis {

    public static boolean isvalid(String str){
        Stack<Character> stack=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='('|| ch=='{'|| ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty())
                    return false;
                char top=stack.pop();

                if(ch==')'&& top!='(' || ch=='}' && top!='{' || ch==']' && top!='[')
                    return false;

        }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        String str="[](){}";
  System.out.print(isvalid(str));

    }
}
