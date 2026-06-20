package DSA.EncodingAndDecoding;

public class ConvertWordToNumber {
    public static void main(String args[]){
      String str="HELLO";
      for(char ch:str.toCharArray()){
          System.out.println((ch-'A')+1);
      }
    }
}
