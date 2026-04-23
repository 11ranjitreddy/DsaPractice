package DSA.String;

import java.util.*;
public class ReverseIndiviudalWordInaSentence {

    public static void reverse(char a[],int s,int e){
        while(s<e){
            char temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String args[]){
        Scanner ss=new Scanner(System.in);
        String str=ss.nextLine();
        char a[]=str.toCharArray();
        int s=0;
        for(int i=0;i<a.length;i++){
            if(i==a.length || a[i]==' '){
                reverse(a,s,i-1);
                s=i+1;
            }
        }

        System.out.println(new String(a));
    }

}
