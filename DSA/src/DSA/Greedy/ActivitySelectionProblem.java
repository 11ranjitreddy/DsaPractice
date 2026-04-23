package DSA.Greedy;

import java.util.*;
public class ActivitySelectionProblem {
    public static void main(String args[]){

        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        int maxAct=1;
        int lastend=end[0];
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(0);

        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                maxAct++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.print(maxAct+" ");
    }
}

