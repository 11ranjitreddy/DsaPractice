package DSA.String;

import java.util.Scanner;

public class Reverse {
    public static void reverse(String str){
        char[] a=str.toCharArray();
        int left=0,right=a.length-1;
        while(left<right){
            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;
       left++;
       right--;
        }
        System.out.println(a);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        reverse(str);

    }
}
