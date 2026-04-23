package DSA.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int Linear(int num[],int key){
        for(int i=0;i<num.length;i++){
           if(num[i]==key)
               return i;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
            num[i]=s.nextInt();
        int key=s.nextInt();

        System.out.println("Key found at : "+Linear(num,key));
    }

}
