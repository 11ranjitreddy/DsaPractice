package DSA.SlidingWIndowPoblems;


public class SidingWindow {
    public static int maxsum(int a[],int k){
        int n=a.length;
        int windowsum=0,max=0;

        for(int i=0;i<k;i++)
            windowsum+=a[i];

        max=windowsum;

        for(int j=k;j<n;j++){
            windowsum+=a[j];
            windowsum-=a[j-k];
            max=Math.max(max,windowsum);
        }
        return max;

    }


    public static void main(String args[]){
        int a[]={2,1,5,1,3,2};
        int k=3;
        System.out.print(maxsum(a,k));
    }
}
