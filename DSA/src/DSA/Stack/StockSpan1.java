package DSA.Stack;

import java.util.*;
public class StockSpan1 {
    public static void SpanProblem(int stock[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=1;i<stock.length;i++){
            int currprice=stock[i];

            while(!s.isEmpty() && currprice>stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prev=s.peek();
                span[i]=i-prev;

            }
            s.push(i);
        }
    }
    public static void main(String[] args){
        int stock[]={100,80,60,70,60,85,100};
        int span[]=new int[stock.length];
        SpanProblem(stock,span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
