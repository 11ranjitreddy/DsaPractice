package DSA.Arrays;

import java.util.Scanner;

public class Medium {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number size:");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the numbers: ");
       for(int i=0;i<n;i++){
           a[i]=s.nextInt();
       }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=a[j];
                }
            }
        }
        float medium;
        if(n%2==0){
             medium=(a[n/2-1]+a[n/2])%2;
        }
        else {medium=a[n/2];}
        System.out.println("Medium is "+medium);
        }

    }


