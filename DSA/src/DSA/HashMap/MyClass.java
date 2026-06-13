package DSA.HashMap;
import java.util.*;

public class MyClass {
    public  static  void main(String args[]){
        Scanner s=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"ranjit");
        map.put(2,"rocky");
        map.put(3,"rahul");

        System.out.print(map.get(1));
        map.put(2,"ramya");
        System.out.print(map.get(2));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("ranjit"));
        System.out.println(map.remove(1));
        System.out.println(map.get(1));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map);
    }
}

