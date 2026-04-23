package DSA.HashSet;

import java.util.*;
public class Duplicate {
    public static boolean isduplicate(int a[]){
        HashSet<Integer> set=new HashSet<>();
        for(int n:a){
            if(!set.add(n))
                return true;
        }
        return false;
    }

    public static void main(String args[]){
        int a[]={1,1,1,3,3,4,3,2,4,2};
        System.out.print(isduplicate(a));

    }

}
