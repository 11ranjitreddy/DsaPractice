package DSA.Functions;

public class CallByValue {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("swap: "+a+" swap: "+b);
    }

    public static void main(String args[]){
        int a=5;
        int b=10;
        swap(a,b);
        System.out.println("a:"+a+" b:"+b);
    }
}
