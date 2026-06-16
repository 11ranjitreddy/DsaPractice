package DSA.Stack;

import  java.util.*;
public class StackOperations {
    public  static  void main(String args[]){
        Scanner s=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int elementt=s.nextInt();
            st.push(elementt);
        }
        System.out.print(st);
        System.out.print(st.search(3));
    }
}
