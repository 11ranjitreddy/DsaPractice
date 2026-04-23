package DSA.Arrays;

import java.util.*;
public class Inventory {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();

        int n2=s.nextInt();
        for(int j=0;j<n2;j++){
            int items=s.nextInt();
            boolean isfound=false;

            for(int i=0;i<n;i++){
                if(a[i]==items){
                    System.out.println(items+" found at "+(i+1));
                    isfound=true;
                    break;
                }
            }
            if(!isfound){
                System.out.println(items+" not found");
            }

        }

    }
}
