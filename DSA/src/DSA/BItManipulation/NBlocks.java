package DSA.BItManipulation;

import  java.util.*;
public class NBlocks {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        List<Integer> A=new ArrayList<>();
        List<Integer> B=new ArrayList<>();

        for(int i=0;i<N;i++)
            A.add(s.nextInt());

        for(int i=0;i<N;i++)
            B.add((s.nextInt()));

        System.out.println(ans(N,A,B));
    }

    public static int ans(int N,List<Integer>A,List<Integer>B){

        List<Integer>sortA=new ArrayList<>(A);
        Collections.sort(sortA,Collections.reverseOrder());

        List<Integer>sortB=new ArrayList<>(B);
        Collections.sort(sortB);


         Integer [] a=new Integer[N];
         Integer [] b=new Integer[N];

         int len=0;
         for(int x:A) len+=x;
         for(int x:B) len+=x;

         int bin[]=new int[len];
         for(int i=0;i<N;i++)
             a[i]=sortA.get(i);

         for(int j=0;j<N;j++)
             b[j]=sortB.get(j);
         int k=0;
         for(int i=0;i<N;i++){
             for( int l=0;l<a[i];l++)
                 bin[k++]=1;
             for(int j=0;j<b[i];j++)
                 bin[k++]=0;
         }
         int deci=0;
         for(int i=0;i<k;i++){
             deci+=Math.pow(2,k-i-1);
         }



        return deci;
    }
}
