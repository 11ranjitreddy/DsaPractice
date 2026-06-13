package DSA.HashMap;

import  java.util.*;

public class FrequencyCounting {
    public static void  main(String args[]){
        Scanner s=new Scanner(System.in);
        int a[]={1,2,3,4,3,1,2,4,5,3,2};

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:a)
            map.put(x,map.getOrDefault(x,0)+1);
        for(Integer x:map.keySet())
            System.out.println(x+" "+map.get(x));
    }
}
