package DSA.SlidingWIndowPoblems;

public class AverageSubarraybyk {
    public static void average(int a[],int k){
        int n=a.length;
        int sum=0;
        int avg=0;
        int b[]=new int[n-k+1];
        for(int i=0;i<k;i++){
            sum+=a[i];
            avg=(sum/k);
        }
        b[0]=avg;
int id=1;
        for(int j=k;j<a.length;j++){
           sum+=a[j];
           sum-=a[j-k];
           avg=(sum/k);
           b[id++]=avg;
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }



    public static void main(String args[]){
        int a[]={2,1,5,1,3,2};
        int k=3;
        System.out.println(" Average of 2,1,5,1,3,2 ");
        average(a,k);
    }

}
