package DSA.SlidingWIndowPoblems;

public class CountEvenNumbers {
    public static void main(String args[]){
        int a[]={1,2,3,4,6,8};
        int n=a.length;
        int k=3;
        for(int i=0;i<=n-k;i++){
            int count=0;
            for(int j=i;j<i+k;j++){
                if(a[j]%2==0){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }

}
