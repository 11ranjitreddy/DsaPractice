package DSA.String;

import java.util.*;
public class Frequency {

    public static void frequency(String str){

        int freq[]=new int[256];

        for(char c:str.toCharArray()){
            freq[c]++;
        }
        for(char c:str.toCharArray()){
            if(freq[c]==1){
                System.out.println(c);
                break;
            }
        }
    }


    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        frequency(str);
    }
}
