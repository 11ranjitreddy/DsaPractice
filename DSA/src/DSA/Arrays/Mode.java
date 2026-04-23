package DSA.Arrays;

import java.util.Scanner;

public class Mode {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number size: ");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the nubmers: ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int mode=a[0],f=1,mf=1;

        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]){
                f++;
            }
            else f=1;
            if(f>mf){
                mf=f;
                mode=a[i];
            }
        }
        System.out.println("Mode is :"+mode);
    }
}
