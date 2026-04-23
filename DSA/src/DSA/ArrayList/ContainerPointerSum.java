package DSA.ArrayList;

import java.util.*;
public class ContainerPointerSum {

    public static int most(ArrayList<Integer> list ){
        int left=0;
        int right=list.size()-1;
        int max=0;
        while(left<right){
            int height=Math.min(list.get(left),list.get(right));
            int width=right-left;
            max=Math.max(max,height*width);

            if(list.get(left)<list.get(right))
                left++;
            else
                right--;
        }

return max;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(s.nextInt());
System.out.println(most(list));
    }
}
