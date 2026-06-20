package DSA.EncodingAndDecoding;

public class EncodedLetters {
    public static void main(String args[]){
        String str="RANJITREDDY";
        for(char ch:str.toCharArray()){
            System.out.println(ch-'A'+1);

        }
    }
}
