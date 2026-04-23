package DSA.Stack;

import java.util.*;
public class StackUsingArrayList {

    ArrayList<Integer> stack=new ArrayList<>();

    void push(int x){
        stack.add(x);
    }

    void pop(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        stack.remove(stack.size()-1);
    }

    void peek(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        System.out.println(stack.get(stack.size()-1));
    }
    void print(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=stack.size()-1;i>=0;i--){
            System.out.print(stack.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        StackUsingArrayList s=new StackUsingArrayList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        s.pop();
        s.print();





























    }
}
