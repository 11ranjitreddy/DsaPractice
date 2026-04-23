package DSA_DAY_PRACTICE;

public class Day14_LongestPalindrome {
    public  static  void main(String args[]){
        String str="aabbbcd";
        System.out.println(Longest(str));
    }
    public static String Longest(String s){
        int n=s.length();
        int start=0;
        int maxlength=0;

        for(int i=0;i<n;i++){
        int left=i;
        int right=i;

        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
            if(right-left+1 >maxlength){
                start=left;
                maxlength=right-left+1;
            }
            left--;
            right++;
        }
        left=i;
        right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if(right-left+1 >maxlength){
                    start=left;
                    maxlength=right-left+1;
                }
                left--;
                right++;
            }
        }
        return s.substring(start,start+maxlength);
    }
}
