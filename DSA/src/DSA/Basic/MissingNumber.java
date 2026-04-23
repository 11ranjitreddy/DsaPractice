package DSA.Basic;

import java.util.*;

public class MissingNumber {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        int a[]={1,2,4};
        int sum=0;
        for(int i=0;i<3;i++){
            sum+=a[i];
        }
        int total=(4*(4+1))/2;

        int missing=total-sum;
        System.out.println(missing);
    }

}
