package DSA.Stack;

import java.util.*;
public class StackCollection {
    public void print(Stack<Integer> s) {
        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i) + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);
        StackCollection ss=new StackCollection();
        ss.print(s);
        s.remove(s.size()-1);
        ss.print(s);

    }
}