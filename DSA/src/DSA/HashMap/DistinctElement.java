package DSA.HashMap;

import java.util.*;
public class DistinctElement {
    public  static void main(String args[]){
        int a[]={1,2,1,3,4,2,3};
        int k=4;
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++)
            map.put(a[i],map.getOrDefault(a[i],0)+1);

        System.out.println(map.size());

        for(int i=k;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            map.put(a[i-k],map.get(a[i-k])-1);
            if(map.get(a[i-k])==0)
                map.remove(a[i-k]);

            System.out.println(map.size());
        }
    }
}
