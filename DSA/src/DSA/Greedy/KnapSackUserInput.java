package DSA.Greedy;

import java.util.*;
public class KnapSackUserInput {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=s.nextInt();
            a[i][1]=s.nextInt();
        }
        int w=s.nextInt();
        double ratio[][]=new double[a.length][2];
        for(int i=0;i<ratio.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=a[i][0]/(double)a[i][1];
        }

        Arrays.sort(ratio,(c,b)->Double.compare(b[1],c[1]));
         int capacity=w;
          int finalvalue=0;

          for(int i=0;i<ratio.length;i++){
              int idx=(int)ratio[i][0];
              if(capacity>=a[idx][1]){
                  finalvalue+=a[idx][0];
                  capacity-=a[idx][1];
              }else{
                  finalvalue+=ratio[i][1]*capacity;
                  capacity=0;
              }


          }

System.out.print(finalvalue);


    }

}
