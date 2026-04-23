package DSA.List;

import java.util.*;
public class DuplicateCount {
    public static List<String> duplicate(String str){
        List<String> list=new ArrayList<>();

        int freq[]=new int[256];
        for(char ch:str.toCharArray())
            freq[ch]++;
        int max=0;
        for(int i=0;i<256;i++){
            if(freq[i]>max)
                max=freq[i];
        }
        boolean isprinted[]=new boolean[256];
        for(int count=max;count>=2;count--){
            for(char ch:str.toCharArray()){
                if(freq[ch]==count && !isprinted[ch]){
                    list.add(ch+" "+count);
                    isprinted[ch]=true;
                }
            }
        }
        return list;
    }

    public static void main(String args[]){
        String str="geeksforgreeks";
        System.out.print(duplicate(str));
    }
}
