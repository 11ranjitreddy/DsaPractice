package DSA.ArrayList;

import java.util.*;
public class ContainerWithMostWater {
    public static int most(ArrayList<Integer> list){
        int max=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height=Math.min(list.get(i),list.get(j));
                int width=j-i;
                int t=height*width;
                max=Math.max(max,t);
            }
        }
        return max;
    }

    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(s.nextInt());
        System.out.println(most(list));

    }
}
