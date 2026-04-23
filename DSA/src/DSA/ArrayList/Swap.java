package DSA.ArrayList;

import java.util.*;
public class Swap {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++)
            list.add(s.nextInt());
        for(int x:list){
            System.out.println(x+" ");
        }
        int temp=list.get(1);
        list.set(1,list.get(2));
        list.set(2,temp);
        for(int x:list){

            System.out.print(x+" ");
        }
        Collections.sort(list);
        System.out.println();
        for(int x:list){
            System.out.print(x+" ");
        }
    }
}
