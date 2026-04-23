package DSA.BackTracking;

import java.util.Scanner;

public class Permutations {
    public static void permu(String str,String ans){
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String str1=str.substring(0,i)+str.substring(i+1);
            permu(str1,ans+curr);
        }
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        permu(str," ");
    }
}
