package DSA.String1;

public class BStringLength {
    public static void main(String args[]){
        String str="hello";
        int count=0;

        for(char ch:str.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
