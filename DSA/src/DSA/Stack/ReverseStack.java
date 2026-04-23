package DSA.Stack;

import java.util.*;
public class ReverseStack {
    static void reverse(Stack<Integer> stack){
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    }
    static void print(Stack<Integer> stack){

    }

    public static void main(String args[]){
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        reverse(stack);
    }
}
