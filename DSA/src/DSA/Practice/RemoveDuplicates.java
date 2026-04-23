package DSA.Practice;

public class RemoveDuplicates {
    public static void main(String args[]){
        String str="My name is ranjit";
      boolean seen[]=new boolean[256];
      StringBuilder sb=new StringBuilder();
      for(char ch:str.toCharArray()){
          if(!seen[ch]){
              seen[ch]=true;
              sb.append(ch);
          }
      }
      System.out.print(sb);

    }
}
