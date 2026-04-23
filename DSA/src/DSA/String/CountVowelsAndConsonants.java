package DSA.String;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void Count(String str){
        int v=0,c=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length()-1;i++){
            char ch=str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
                v++;
            }
            c++;
        }
        System.out.println("Vowels: "+v+" Consonatns: "+c);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Count(str);
    }
}
