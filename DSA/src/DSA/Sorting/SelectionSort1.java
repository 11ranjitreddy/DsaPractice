package DSA.Sorting;

public class SelectionSort1 {
    public static void main(String args[]){
        int a[]={29,10,14,37,13};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
