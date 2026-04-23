package DSA.ArrayList;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.set(3,40));
        System.out.println(list);
        System.out.println(list.contains(20));
        System.out.println(list.size());
    }
}
