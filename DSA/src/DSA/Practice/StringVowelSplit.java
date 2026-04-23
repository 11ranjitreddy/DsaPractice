package DSA.Practice;
public class StringVowelSplit {
    public static boolean isvowel(String str){
        if(str==null || str.length()==0)return false;
        str=str.toLowerCase();
        int start=0;
        int end=str.length()-1;

        if((str.charAt(start)=='a'|| str.charAt(start)=='e'||str.charAt(start)=='i'||str.charAt(start)=='o'||str.charAt(start)=='u')&&
                str.charAt(end)=='a'||str.charAt(end)=='e'||str.charAt(end)=='i'||str.charAt(end)=='o'||str.charAt(end)=='u')
                return true;
        return false;
    }
    public static String swap(String str){
        int left=1;
        int right=str.length()-2;
        char[] a=str.toCharArray();
        while (left<right){
            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        return new String(a);
    }
    public static void main(String args[]){
        String str="My name is ranjit";
        String word[]=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<word.length;i++){
            if(isvowel(word[i])){
                sb.append(swap(word[i])).append(" ");
            }else {
                sb.append(word[i]).append(" ");
            }
        }
        System.out.print(sb);
    }
}
