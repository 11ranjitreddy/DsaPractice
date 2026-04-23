package DSA.Arrays;

import java.util.Scanner;

public class TrappingRainWater {

    public static int Trap(int height[]){
        int n=height.length;
        int trap=0;
        //LeftMax
        int leftmax[]=new int[n];
         leftmax[0]=height[0];
        for(int i=1;i< leftmax.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //RightMax
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //Water flow
        for(int i=0;i<n;i++){
            int waterflow=Math.min(leftmax[i],rightmax[i] );
            trap+=waterflow-height[i];
        }
        return trap;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Heights of the building");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println(Trap(a));
    }}
