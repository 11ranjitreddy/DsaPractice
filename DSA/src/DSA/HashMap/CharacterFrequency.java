package DSA.HashMap;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String args[]){
        String str="RanjitReddy";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);

        for(Character ch:map.keySet())
            System.out.println(ch+" "+map.get(ch));
    }
}
