package DSA.Stack;

import java.util.*;
public class Stack1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st);

    }

}
