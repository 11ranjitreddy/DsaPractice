package DSA.HashMap;

import  java.util.*;
public class FIndFrequencyInEachWIndow {
    public  static  void main(String args[]){
        int a[]={1, 2, 2, 3, 3, 3, 1};
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=a.length;
        int k=3;
        for(int i=0;i<k;i++)
        map.put(a[i],map.getOrDefault(a[i],0)+1);

        System.out.println(frequency(map));
        for(int i=k;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            int out=a[i-k];

            map.put(out,map.get(out)-1);
            if(map.get(out)==0)
                map.remove(out);

            System.out.println(frequency(map));

        }


    }
    public  static int frequency(HashMap<Integer,Integer> map){
        int max=0;
        int ans=-1;
        for(Integer x:map.keySet()){
            if(map.get(x)>max){
                max=map.get(x);
                ans=x;
            }
        }
        return ans;
    }
}
