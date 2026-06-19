package DSA.String;

public class ExtractEmail {
    public static  void main(String args[]){
        String str="Name:Ranjit Email:abc@gmail.com";
        String word[]=str.split(" ");
        String Email="";
        for(String words:word){
            if(words.contains(".com"))
                Email+=words;
        }
        Email=Email.replace("Email:","");
        System.out.println(Email);
    }
}
