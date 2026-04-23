package DSA.BackTracking;

import java.util.Scanner;

public class Subsets {
    public static void subset(String str,int i,String ans){
        if(i==str.length()){
            if(ans.length()==0)
            System.out.print("null");
            else
                System.out.print(ans+" ");
            return;
        }
        subset(str,i+1,ans+str.charAt(i));
        subset(str,i+1,ans);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        subset(str,0,"");
    }
}
