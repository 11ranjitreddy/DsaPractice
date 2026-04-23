package DSA.Arrays;

import java.util.*;
public class Largest {

    public static int larg(int num[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }

        }
        System.out.println("Smallest; "+smallest);
        return largest;
    }

    public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int num=s.nextInt();
  int a[]=new int[num];
  for(int i=0;i<a.length;i++){
      a[i]=s.nextInt();
  }
  System.out.println("Largest: "+larg(a));
    }
}
