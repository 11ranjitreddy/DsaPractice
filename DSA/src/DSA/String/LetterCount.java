package DSA.String;

import java.util.*;
public class LetterCount {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
          char ch=s.next().charAt(0);
        int count=0;
        for(char x:str.toCharArray()){
                if(x==ch){
                    count++;
                }
        }
        System.out.println(count);
    }
}
