package DSA.String1;

public class EReverseEachWord {
    public static void main(String args[]){
        String str="Ranjit reddy is my name";
        String word[]=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<word.length;i++){
            sb.append(reverse(word[i])).append(" ");
        }
        System.out.println(sb);
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
