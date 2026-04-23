package DSA.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Inbuilt {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Integer a[]=new Integer[n];
        for(int i=0;i<a.length;i++)
            a[i]=s.nextInt();
//          Arrays.sort(a);
//          for(int i=0;i<a.length;i++)
//          System.out.print(a[i]+" ");
          Arrays.sort(a,Collections.reverseOrder());
          for (int i=0;i<a.length;i++)
              System.out.print(a[i]+" ");
    }
}
