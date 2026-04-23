package DSA.ArrayList;

import java.util.*;
public class TargetSum1 {
public static boolean isTarget(ArrayList<Integer> list,int target){
    Collections.sort(list);
    int left=0;
    int right=list.size()-1;
    while(left!=right){
        if(list.get(left)+list.get(right)==target)
            return true;
        if(list.get(left)+list.get(right)<target){
            left++;
        }
        else
            right--;
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
System.out.println(isTarget(list,target));
    }

}
