package DSA.Functions;

import java.util.Scanner;

public class BinomialCoefficient1 {

    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static int bif(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int sub=n-r;
        int fact_n_r=fact(sub);

        int last=fact_n/(fact_r * fact_n_r);
        return last;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();

        bif(n,r);
        System.out.println(bif(n,r));
    }


}
