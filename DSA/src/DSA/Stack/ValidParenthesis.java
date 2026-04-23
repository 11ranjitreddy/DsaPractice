package DSA.Stack;

import java.util.*;
public class ValidParenthesis {
    public static boolean isvalid(String str){
        Stack<Character> stack=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((ch=='}' && top!='{') || (ch==']' && top!='[')||(ch==')' && top!='('))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
     System.out.println(isvalid(str));
    }
}
