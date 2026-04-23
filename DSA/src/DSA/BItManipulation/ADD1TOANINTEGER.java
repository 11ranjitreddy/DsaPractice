package DSA.BItManipulation;

import java.util.Scanner;

public class  ADD1TOANINTEGER {
    public static int add(int n,int i){
        int bit=1<<i;
        return n|bit;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int n=s.nextInt();
        int i=s.nextInt();
        System.out.print(add(n,i));
    }
}
