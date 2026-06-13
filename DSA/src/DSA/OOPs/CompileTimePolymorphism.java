package DSA.OOPs;

public class CompileTimePolymorphism {
    public static void main(String args[]){
        Math m=new Math();
       System.out.println( m.add(1,2));
       System.out.println( m.add(1,2,3));

    }
    static class Math{
        int add(int a ,int b){return a+b;}
        int add(int a,int b,int c){return a+b+c;}

    }

}
