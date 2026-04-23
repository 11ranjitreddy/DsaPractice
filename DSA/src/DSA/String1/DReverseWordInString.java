package DSA.String1;

public class DReverseWordInString {
    public static void main(String args[]){
        String s = "the sky is blue";
        String word[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        String res="";
        for(int i=word.length-1;i>=0;i--){
            sb.append(word[i]).append(" ");
        }
        System.out.println(sb);
    }
}
