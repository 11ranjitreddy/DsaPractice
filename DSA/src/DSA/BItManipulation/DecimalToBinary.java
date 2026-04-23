package DSA.BItManipulation;

import java.util.Scanner;

public class  DecimalToBinary {
    public static int DB(int n){
        int bc=0;
        int pow=0;
        while(n!=0){
            int rm=n%2;
                bc=bc+rm*(int)Math.pow(10,pow);
                pow++;
                n/=2;
        }
        return bc;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(DB(n));
    }
}
