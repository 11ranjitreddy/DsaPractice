package DSA.HashMap;
import java.util.*;
public class ParticularElementFrequency {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,4,2,1,3,4,1,1,4,6};
        Scanner s=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:a)
            map.put(x,map.getOrDefault(x,0)+1);

        int max=0;
        int ans=0;
        for(Integer k:map.keySet()){
            if(map.get(k)>max){
                max=map.get(k);
                ans=k;
            }
        }
        System.out.print(ans);

    }
}
