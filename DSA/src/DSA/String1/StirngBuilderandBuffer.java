package DSA.String1;

public class StirngBuilderandBuffer {
    public static void main(String args[]){

        StringBuilder sb=new StringBuilder("hello");
        sb.append("world");
        System.out.println(sb);
        sb.insert(5,"java");
        System.out.println(sb);
        sb.delete(5,10);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
