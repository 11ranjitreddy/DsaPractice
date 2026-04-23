package DSA.SlidingWIndowPoblems;

public class CountPositiveNumbers {
    public static void main(String args[]){
        int a[]={-1,2,-3,4,5};
        int k=2;
        int n=a.length;
        for(int i=0;i<=n-k;i++){
            int count=0;
            for(int j=i;j<i+k;j++){
                if(a[j]>0){
                    count++;
                }

            }
            System.out.print(count+" ");
        }
    }
}
