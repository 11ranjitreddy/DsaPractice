package DSA.ArrayList;

import java.util.*;
public class TargetSum {
    public static boolean isvalid(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if((list.get(i)+list.get(j))==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(s.nextInt());
        int target=s.nextInt();
System.out.println(isvalid(list,target));

    }
}
