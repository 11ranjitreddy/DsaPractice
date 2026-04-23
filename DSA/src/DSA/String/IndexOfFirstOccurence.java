package DSA.String;

import java.util.*;
public class IndexOfFirstOccurence {
    public static int find(String str1,String str2){
        if(str1.length()<0)return 0;
        int n=str1.length();
        int m=str2.length();

        for(int i=0;i<=n-m;i++){
            int j=0;
            while(j<m && str1.charAt(i+j)==str2.charAt(j)){
                j++;
            }if(j==m)return i;
        }
        return -1;

    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        System.out.print(find(str1,str2));

    }
}
