package DSA.HashMap;

import  java.util.*;
public class LongestSubarray {
    public static  void main(String args[]){
        int a[]={3,3,3,1,2,1,1,2,3,3,4};
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int left=0;

        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);

            while (map.size()>2){
                map.put(a[left],map.get(a[left])-1);

                if(map.get(a[left])==0)
                    map.remove(a[left]);
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        System.out.print(max);
    }
}
