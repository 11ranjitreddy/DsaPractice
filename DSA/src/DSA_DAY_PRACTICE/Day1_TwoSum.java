package DSA_DAY_PRACTICE;

public class Day1_TwoSum {
    public static void twosum(int a[],int k){
        bubble(a);
        int left=0;
        int right=a.length-1;

        while (left<right){
            int sum=a[left]+a[right];
            if(sum==k){
                System.out.print("["+ a[left] +","+a[right]+"]"+" ");
                left++;
                right--;
            }else if(sum<k){
                left++;
            }else
                right--;
        }
    }

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7};
        int k=9;
twosum(a,k);
    }
    public static void bubble(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i- a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }
}
