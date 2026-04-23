package DSA.BackTracking;

import java.util.Scanner;

public class Subset1 {
    static int count=0;
    public static void subset(String str,String ans,int i){
        if(i==str.length()){
            System.out.println(ans+" ");
            count++;
            return;
        }
        subset(str,ans+str.charAt(i),i+1);
        subset(str,ans,i+1);
    }
    public static void count(int count){
        System.out.println();
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        subset(str,"",0);
        System.out.println(count);
    }
}
