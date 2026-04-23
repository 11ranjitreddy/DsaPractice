package DSA.BackTracking;

public class Simple {
    public static void Backtrack(int a[],int i,int val){
        if(i==a.length){
            print(a);
            return;
        }
        a[i]=val;
        Backtrack(a,i+1,val+1);
        a[i]=a[i]-2;
    }
    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int a[]=new int[5];
        Backtrack(a,0,1);
        print(a);
    }
}
