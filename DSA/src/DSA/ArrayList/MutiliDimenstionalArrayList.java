package DSA.ArrayList;

import java.util.ArrayList;

public class MutiliDimenstionalArrayList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> row1=new ArrayList<>();
        ArrayList<Integer> row2=new ArrayList<>();
        row1.add(10);
        row1.add(20);
        row1.add(30);

        row2.add(40);
        row2.add(50);
        row2.add(60);

        list.add(row1);
        list.add(row2);

     //   System.out.println(list);
        int value=list.get(1).get(2);
        System.out.println(value);

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.println(list.get(i).get(j)+" ");
            }
        }
    }
}
