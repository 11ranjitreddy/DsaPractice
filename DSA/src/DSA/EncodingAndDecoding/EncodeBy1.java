package DSA.EncodingAndDecoding;
import java.util.*;
public class EncodeBy1 {
    public static void main(String args[]){
        String str="abc";
        String encode="";
        for(char ch:str.toCharArray()){
            encode+=(char)(ch+1);
        }
        System.out.print(encode);
    }

}
