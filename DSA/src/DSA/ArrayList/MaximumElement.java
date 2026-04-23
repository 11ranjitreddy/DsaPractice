package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++)
            list.add(s.nextInt());

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int x:list){
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        System.out.println(max+" "+min+" ");
    }
}
