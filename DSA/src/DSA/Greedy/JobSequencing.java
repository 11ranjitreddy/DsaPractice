package DSA.Greedy;

import java.util.*;
public class
JobSequencing {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[][]=new int[n][3];
        for(int i=0;i<a.length;i++){
            a[i][0]=i+1;
            a[i][1]=s.nextInt();
            a[i][2]=s.nextInt();
        }
        Arrays.sort(a,(b,c)->Integer.compare(c[2],b[2]));
        int maxDeadline=0;
        for(int i=0;i<a.length;i++)
            maxDeadline=Math.max(maxDeadline,a[i][1]);

        int totalprofit=0;
        boolean slot[]=new boolean[maxDeadline+1];

        for(int i=0;i<a.length;i++){
            for(int t=a[i][1];t>0;t--){
                if(!slot[t]){
                    slot[t]=true;
                    totalprofit+=a[i][2];
                    break;
                }
            }
        }

System.out.print(totalprofit);

    }
}
