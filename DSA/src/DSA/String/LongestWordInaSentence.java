package DSA.String;

import java.util.*;
public class LongestWordInaSentence {
    public static void findlength(char[]a,int s,int e){
        


    }

    public static void main(String args[]){
        Scanner ss=new Scanner(System.in);
        String str=ss.nextLine();
        char a[]=str.toCharArray();
        int s=0;
        for(int i=0;i<a.length;i++) {
            if (i==a.length || a[i]==' ' ){
                findlength(a,s,i-1);
                s=i+1;
            }
        }
    }
}
