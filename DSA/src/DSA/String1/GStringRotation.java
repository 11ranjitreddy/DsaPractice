package DSA.String1;

public class GStringRotation {
    public static void main(String args[]) {
        String s1 = "abcde";
        String s2 = "cdeab";

        System.out.println(isrotation(s1,s2));
    }
    public static boolean isrotation(String s1,String s2){
        int a=s1.length();
        int b=s2.length();
        if(a!=b)
            return false;
     String temp=s1+s1;

        return temp.contains(s2);
    }
}