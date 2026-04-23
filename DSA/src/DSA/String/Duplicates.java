package DSA.String;

import java.util.Scanner;

public class Duplicates {
    public static void duplicate(String str){
        StringBuilder sb=new StringBuilder();
        boolean[] seen=new boolean[256];
        for(char c: str.toCharArray()){
            if(!seen[c]){
                seen[c]=true;
                sb.append(c);
            }
        }
        System.out.println( sb.toString());
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        duplicate(str);
    }
}
