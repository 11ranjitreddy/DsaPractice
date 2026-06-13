package DSA.HashMap;

import java.util.HashMap;

public class FIrstNonRepatingElement {
    public static void  main(String args[]){
        int a[]={1 ,2, 3, 2, 1, 4, 5, 5};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int x:a)
            map.put(x,map.getOrDefault(x,0)+1);

        for(Integer x:map.keySet()){
            if(map.get(x)==1){
                System.out.print(x);
                return;
            }
        }
    }
}
