package DSA_DAY_PRACTICE;


public class Day3_Valid_Palindrome {

    public static boolean isvalid(String s){
        int left=0;
        s=s.toLowerCase().replace(" ","");
        int right=s.length()-1;
        while (left<right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]){
        String s = "A man a plan a canal Panama";
        System.out.print(isvalid(s));
    }
}
