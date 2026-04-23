package DSA.Stack;

import java.util.*;
public class StackWithArray {
    static class Stack{
        ArrayList<Integer> list=new ArrayList<>();

        public void push(int data){
            list.add(data);
        }

        public int pop(){
            if(list.isEmpty()){
                System.out.println("List is Empty: ");
                return -1;
            }
          return  list.remove((list.size()-1));
        }
        public int peek(){
            if(list.isEmpty()){
                System.out.println("List is Empty: ");
                return -1;
            }
            return list.get(list.size()-1);
        }

        public void print(){
            for(int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.print();
        System.out.println(s.peek());
        s.pop();
        s.print();
    }
}
