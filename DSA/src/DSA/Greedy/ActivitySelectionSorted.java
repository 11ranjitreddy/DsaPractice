package DSA.Greedy;

import java.util.*;
public class ActivitySelectionSorted {
    public static void main(String args[]){
        int start[]={4, 1, 3, 0, 5, 8, 5};
        int end[]={7, 2, 4, 6, 9, 9, 7};

        Integer idx[]=new Integer[end.length];

         for(int i=0;i<idx.length;i++){
             idx[i]=i;
         }
        Arrays.sort(idx,(a,b)->end[a]-end[b]);

        int maxAct=1;
        int lastEnd=end[idx[0]];
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(idx[0]);

        for(int i=1;i<idx.length;i++){
            if(start[idx[i]] >= lastEnd){
                maxAct++;
                ans.add(idx[i]);
                lastEnd=end[idx[i]];
            }
        }


      System.out.println(maxAct+" ");
        System.out.print(ans);
    }

}
