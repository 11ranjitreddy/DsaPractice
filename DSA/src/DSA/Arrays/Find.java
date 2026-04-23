package DSA.Arrays;

import java.util.Scanner;

public class Find {

    public static int find(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key)
                System.out.println(i);
            else
                System.out.println("-1");
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=s.nextInt();
        int key=s.nextInt();
        find(a,key);
    }
}
