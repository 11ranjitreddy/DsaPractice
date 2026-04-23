package DSA.String;

import java.util.Scanner;

public class LongestCommonSequence {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String str1=s.nextLine();

        int i=0;
        int j=0;
        int count=0;
        while (i<str.length() && j<str1.length()){
            if(str.charAt(i)== str1.charAt(j)){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        System.out.println(count);
    }

}
