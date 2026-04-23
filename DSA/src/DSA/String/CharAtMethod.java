package DSA.String;

import java.util.Scanner;

public class CharAtMethod {

    public static void print(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String ss=s.nextLine();
        print(ss);
    }
}
