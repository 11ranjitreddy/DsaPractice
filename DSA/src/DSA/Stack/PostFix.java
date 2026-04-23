package DSA.Stack;

import  java.util.*;
public class PostFix {
    public static void main(String args[]){
        String exp="352*+";
        System.out.print(postfix(exp));
    }
    public static int postfix(String exp){
        Stack<Integer>s=new Stack<>();
        for(char ch:exp.toCharArray()){
            if(Character.isDigit(ch))
                s.push(ch-'0');
            else {
                int a = s.pop();
                int b = s.pop();
                switch (ch){
                    case '+':s.push(a+b);break;
                    case '*':s.push(a*b);break;
                    case '/':s.push(a/b);break;
                    case '%':s.push(a%b);break;
                }
            }
        }
        return s.pop();
    }
}
