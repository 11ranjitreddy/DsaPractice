package DSA.String;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String duplicates(String str){
        StringBuilder sb=new StringBuilder();
        boolean[] seen=new boolean[256];
        for(char i:str.toCharArray()){
            if(!seen[i]){
                seen[i]=true;
                sb.append(i);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(duplicates(str));
    }
}
