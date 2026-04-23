package DSA.String;

public class VowelSwapping {
    public static boolean vowelcheck(String str) {
        int left = 0;
        int right = str.length()-1;
       if((str.charAt(left)=='a' || str.charAt(left)=='e' || str.charAt(left)=='i' || str.charAt(left)=='o' || str.charAt(left)=='u')&&
               (str.charAt(right)=='a' || str.charAt(right)=='e' || str.charAt(right)=='i' || str.charAt(right)=='o' || str.charAt(right)=='u')
       )return true;

       return false;
    }
  public static String swapping(String str){
        int left=1;
        int right=str.length()-2;
        char a[]=str.toCharArray();
        while(left<right){
            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;

            left++;
            right--;
        }

       return new String(a);
  }
    public static void main(String args[]){
        String str="my name is anjite reddy";
        String word[]=str.split(" ");
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<word.length;i++){
            if(vowelcheck(word[i])){
                sb.append(swapping(word[i])).append(" ");
            }else
            {
                sb.append(word[i]).append(" ");
            }
        }
        System.out.print(sb.toString());
    }
}
