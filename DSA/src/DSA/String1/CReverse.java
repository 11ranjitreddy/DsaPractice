package DSA.String1;

public class CReverse {
    public static void main(String args[]){
        String str="hello";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        int left=0;
        int right=str.length()-1;
        char a[]=str.toCharArray();
        while (left<right){
            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        return new String(a);
    }
}
