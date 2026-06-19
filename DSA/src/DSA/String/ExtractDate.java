package DSA.String;

public class ExtractDate {
    public static void main(String args[]){
        String str="Date=19/06/2026";
        String s[]=str.replace("Date=","").split("/");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        int c=Integer.parseInt(s[2]);

        System.out.println(a+" "+b+" "+c);
    }
}
