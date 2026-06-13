package DSA.HashMap;
import  java.util.*;

public class MyClass1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the key:");
            int key=s.nextInt();
            System.out.print("Enter the value:");
            int value=s.nextInt();
            map.put(key,value);
        }
        System.out.print(map);
    }
}
