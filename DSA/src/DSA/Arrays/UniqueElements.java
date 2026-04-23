package DSA.Arrays;

import java.util.Scanner;

public class UniqueElements {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the numbers: ");
        for (int i=0;i<n;i++){
            a[i]=s.nextInt();
        }

            for(int i=0;i<n;i++){
                int count=0;
                for(int j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                        count++;
                    }
                }
                if(count==1){
                    System.out.println(a[i]);
                }
            }
    }
}
