package DSA.MergeIntervals;

import  java.util.*;
public class Mergeintervals {
    public static void main(String args[]){
        int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};

        int [][] result=(merge(intervals));
        for(int[]i:result){
            System.out.print("["+i[0]+","+i[1]+"],");
        }
    }
    public static int[][] merge(int[][] intervals){
        ArrayList<int[]>list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int current[]=intervals[0];

        for(int i=1;i<intervals.length;i++){
            int next[]=intervals[i];

            if(next[0]<=current[1]){
                current[1]=Math.max(next[1],current[1]);
            }else{
                list.add(current);
                current=next;
            }
        }
        list.add(current);

        return list.toArray(new int[0][]);
    }
}
