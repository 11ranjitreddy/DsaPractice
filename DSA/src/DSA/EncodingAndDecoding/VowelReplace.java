package DSA.EncodingAndDecoding;

public class VowelReplace {
    public static void main(String args[]){
        String str="RanjitReddy";

        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(isVowel(ch)){
                sb.append("*");
            }else{
            sb.append(ch);}
        }
        System.out.println(sb);
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
            return true;

        return false;
    }
}
