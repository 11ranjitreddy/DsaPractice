package DSA.Functions;
import java.util.Scanner;

public class Duplicates {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int temp[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            boolean seen=false;
            for(int j=0;j<k;j++){
                if(a[i]==temp[j]){
                    seen=true;
                    break;
                }
            }
            if(!seen){
                temp[k++]=a[i];
            }
        }
        for( int i=0;i<k;i++){
            System.out.println(temp[i]+" ");
        }
    }
}
