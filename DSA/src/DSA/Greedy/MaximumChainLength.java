package DSA.Greedy;

import java.util.*;
public class MaximumChainLength {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=s.nextInt();
            a[i][1]=s.nextInt();
        }
        Arrays.sort(a,(b,c)->Integer.compare(b[1],c[1]));

        int maxpair=1;
        int lastEnd=a[0][1];

        for(int i=1;i<a.length;i++){
            if(a[i][0]>lastEnd){
                maxpair++;
                lastEnd=a[i][1];
            }
        }

        System.out.print(maxpair);
    }
}
