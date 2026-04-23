package DSA.Sorting;

public class Insertion1 {
    public static void main(String args[]){
        int a[]={29,10,14,37,13};

        int n=a.length;
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;

            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+ " ");
    }
}
