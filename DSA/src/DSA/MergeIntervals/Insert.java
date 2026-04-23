package DSA.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Insert {
    public static void main(String args[]){
        int intervals[][] = {{1,2},{3,5},{6,7},{8,10},{12,16}}, newInterval[] = {4,8};

        int result[][]=insert(intervals,newInterval);
          for(int[]i:result)
              System.out.print("["+i[0]+","+i[1]+"],");
    }
    public static int[][] insert(int[][] intervals,int[] newInterval){
        int all[][]=new int[intervals.length+1][];
 ArrayList<int[]>list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
            all[i]=intervals[i];

        all[intervals.length]=newInterval;

        Arrays.sort(all,(a,b)->a[0]-b[0]);
        int current[]=all[0];

        for(int i=1;i<all.length;i++){
            int next[]=all[i];
            if(next[0]<=current[1]){
                current[1]= Math.max(next[1],current[1]);
            }
            else{
                list.add(current);
                current=next;
            }
        }
        list.add(current);
        return list.toArray(new int[0][]);
    }
}
