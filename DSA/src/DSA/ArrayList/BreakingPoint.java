package DSA.ArrayList;

import java.util.*;
public class BreakingPoint {

    public static boolean isSum(ArrayList<Integer> list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else
                rp=(n+rp-1)%n;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(s.nextInt());
        int target=s.nextInt();
        System.out.println(isSum(list,target));
    }
}
