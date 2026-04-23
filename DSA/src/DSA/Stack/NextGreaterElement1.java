package DSA.Stack;

import java.util.*;
public class NextGreaterElement1 {
    public static void main(String args[]){
        int a[]={6,8,0,1,3};
        int nextgreater[]=new int[a.length];
        Stack<Integer> s=new Stack<>();

        for(int i=a.length-1;i>=0;i--){

            while(!s.isEmpty() && a[s.peek()]<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgreater[i]=-1;
            }else{
                nextgreater[i]=a[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<a.length;i++)
            System.out.print(nextgreater[i]+" ");

    }

}
