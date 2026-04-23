package DSA.String;

import java.util.Scanner;

public class Suffle {
    public static void print(String str){
        if(str.length()<3){
            System.out.println(str);
        }
        char first=str.charAt(0);
        char last=str.charAt(str.length()-1);
        boolean isstring =false;
        if(first=='a' || first=='e' || first =='i' || first=='u' ||first=='o' && last =='a' || last=='e' ||last=='i'||last=='o'|| last=='u'){
            isstring=true;}

        char[] ch=str.toCharArray();
            if(isstring){
               int l=1;
               int r=ch.length-2;
               while(l<r) {
                   int n = ch.length;
                   char temp = ch[l];
                   ch[l] = ch[r];
                   ch[r] = temp;
                   l++;
                   r--;
               }
            }
            System.out.println(ch);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
print(str);

             }
        }

