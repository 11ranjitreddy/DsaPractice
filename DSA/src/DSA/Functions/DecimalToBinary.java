package DSA.Functions;

import java.util.Scanner;

public class DecimalToBinary {
    public static int DB(int n){
        int pow=0;
        int bn=0;
        while(n!=0){
            int rm=n%2;
            bn=bn+(rm*(int)Math.pow(10,pow));
            pow++;
            n/=2 ;

        }
        return bn;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Decimal Number; ");
        int n=s.nextInt();
        System.out.println("Decimal To Binary is : "+DB(n));
    }
}
