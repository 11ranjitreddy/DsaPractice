package DSA.EncodingAndDecoding;

public class UpperCaseToLowerCase {
    public static void main(String args[]){
        String str="RanjItReDdy";
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch>='A' && ch<='Z')
                sb.append((char)(ch+32));
            else
                sb.append((char) (ch-32));
        }
        System.out.print(sb);
    }
}
