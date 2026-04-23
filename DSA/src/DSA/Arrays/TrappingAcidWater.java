package DSA.Arrays;

import java.util.Scanner;

public class TrappingAcidWater {
    public static int sotre(int height[]){
        int n=height.length;

        //leftmax
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        //rightmax
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trap=0;
        for(int i=0;i<n;i++){
            int water=Math.min(leftmax[i],rightmax[i]);
            trap+=water-height[i];
        }
        return trap;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=s.nextInt();
        System.out.println(sotre(a));
    }
}
