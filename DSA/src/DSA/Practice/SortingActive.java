package DSA.Practice;

import java.util.*;

public class SortingActive {
    public static  void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int aa[][]=new int[n][2];

        for(int i=0;i<n;i++){
            aa[i][0]=s.nextInt();
            aa[i][1]=s.nextInt();
        }
        Arrays.sort(aa,(a,b)->Integer.compare(b[0],a[0]));
        for(int i=0;i<n;i++)
            System.out.println(aa[i][0]+" "+aa[i][1]);

        int sum=0;
        for(int i=0;i<n;i++){
            int x=aa[i][0];
            int y=aa[i][1];
            sum+=x-y*i;
        }
        System.out.println(sum);

        int mul=0;
        for(int i=0;i<n;i++){
            int x=aa[i][0];
            int y=aa[i][1];
            mul+=x-y*i;
        }
        System.out.println(mul);
    }

}
