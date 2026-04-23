package DSA.String;

import java.util.*;
public class Vowels {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      str=str.toLowerCase();
      int count=0;
      for(char ch:str.toCharArray()){
          if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
              count++;
          }
      }
      System.out.println(count);
    }

}
