package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            list.add(s.nextInt());
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        for(int i=n-1;i>=0;i--){
            System.out.print(list.get(i));
        }
    }
}
