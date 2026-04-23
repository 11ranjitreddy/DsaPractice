package DSA.List;

import  java.util.*;
public class Pascal {
    public static List<List<Integer>> pascal(int n){
        List<List<Integer>>triangle=new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer>row=new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0|| j==i){
                    row.add(1);
                }else{
                    int t=triangle.get(i-1).get(i-1)+triangle.get(i-1).get(j);
                    row.add(t);
                }
            }
            triangle.add(row);
        }
        return  triangle;
    }


    public static  void main(String args[]){
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
System.out.println(pascal(n));
    }
}
