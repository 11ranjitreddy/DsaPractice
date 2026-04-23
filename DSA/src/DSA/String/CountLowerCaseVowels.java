package DSA.String;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class CountLowerCaseVowels {
    public static void Cv(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                count++;
            }

        }
        System.out.println(count);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Cv(str);
    }
}
