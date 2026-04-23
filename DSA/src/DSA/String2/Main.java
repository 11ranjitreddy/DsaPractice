package DSA.String2;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String args[]){
//        String str="Ranjit reddy";
//        System.out.print(reverse(str));
//    }
//    public static String reverse(String str){
//        int left=0;
//        int right=str.length()-1;
//        char a[]=str.toCharArray();
//        while (left<right){
//            char temp=a[left];
//            a[left]=a[right];
//            a[right]=temp;
//            left++;
//            right--;
//        }
//        return new String(a);

//        String str="rarr";
//       System.out.print( ispalindrome(str));
//    }
//    public static boolean ispalindrome(String str){
//        int left=0;
//        int right=str.length()-1;
//        char a[]=str.toCharArray();
//        while (left<right){
//            if(a[left]!=a[right])
//                return false;
//            left++;
//            right--;
//        }
//        return  true;

//    String str="my name is ranjit reddy";
//    System.out.print(count(str));
//    }
//    public static int count(String str){
//        str=str.toLowerCase();
//        int sum=0;
//        for(char ch:str.toCharArray()){
//            if(ch =='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
//                sum++;
//        }
//        return sum;

//        String str="My name is ranjit";
////        str=str.replace(" ","");
////        System.out.print(str);
//        String res="";
//        StringBuilder sb=new StringBuilder();
//        for(char ch:str.toCharArray()){
//            if(ch!=' '){
//                sb.append(ch);
//            }
//        }
//        System.out.print(sb);
//        String str="Santosh is the one of the person i have ever seen before";
//        String word[]=str.split(" ");
//        StringBuilder sb=new StringBuilder();
//        for(int i=word.length-1;i>=0;i--){
//            sb.append(word[i]).append(" ");
//        }
//        System.out.print(sb);
//        String str="Santosh is the one of the person i have ever seen before";
//        String word[]=str.split(" ");
//         reverse(word);
//    }
//    public static void reverse(String str[]){
//        StringBuilder sb=new StringBuilder();
//        int left=0;
//        int right=str.length-1;
//        while (left<right){
//            String temp=str[left];
//            str[left]=str[right];
//            str[right]=temp;
//            left++;
//            right--;
//        }
//       for(String s:str)
//           System.out.print(s+" ");
//        String a="ranjit";
//        String b="ranjit";
//        char ch[]=a.toCharArray();
//        char chh[]=b.toCharArray();
//        Arrays.sort(ch);
//        Arrays.sort(chh);
//        if(Arrays.equals(ch,chh)){
//            System.out.print("yes");
//        }else System.out.print("no");

//        String str="My name is ranjit reddy";
//        boolean isseen[]=new boolean[256];
//        for(char ch:str.toCharArray()){
//
//            if(!isseen[ch]){
//                isseen[ch]=true;
//                int count=0;
//
//            for(char c:str.toCharArray()){
//                if(c==ch){
//                    count++;
//                }
//            }
//            if(count==1)
//                System.out.print(ch);
//            break;
//            }
//        }
//        String str="MyNamEiSrAnJiT";
//        StringBuilder sb=new StringBuilder();
//        for(char ch:str.toCharArray()){
//            if(Character.isLowerCase(ch))
//                sb.append(Character.toUpperCase(ch));
//            else
//                sb.append(Character.toLowerCase(ch));
//
//
//        }
//        System.out.print(str);
//        System.out.println();
//        System.out.print(sb);

        String str="My name is ranjit reddy";
        HashSet<Character> list=new HashSet<>();
        str=str.toLowerCase();
        for(char ch:str.toCharArray()){
            if(list.contains(ch)){

            }
            list.add(ch);
        }
    }
}
