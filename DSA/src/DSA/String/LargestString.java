package DSA.String;

import java.util.Scanner;

public class LargestString {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String fruit[]=new String[n];
        for(int i=0;i<n;i++)
            fruit[i]=s.nextLine();
        String largest=fruit[0];
        for(int i=0;i<fruit.length;i++){
            if(largest.compareTo(fruit[i])<0){
                largest=fruit[i];
            }
        }
        System.out.println(largest);
    }
}
