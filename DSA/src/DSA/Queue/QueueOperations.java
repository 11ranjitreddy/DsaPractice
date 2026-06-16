package DSA.Queue;

import  java.util.*;
public class QueueOperations {
    public static void  main(String args[]){
        Scanner s=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int element=s.nextInt();
            q.add(element);
        }
        q.size();
        q.peek();
        q.poll();
        q.isEmpty();
    }
}
