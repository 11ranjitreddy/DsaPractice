package DSA.SlidingWIndowPoblems;

public class CountVowelsOofN {
    public static void main(String args[]) {
        String str = "ranjitreddy";
        int count = 0;
        int k = 2;
        for (int i = 0; i < k; i++) {
            if (isvowel(str.charAt(i)))
                count++;
        }
        int max=count;

        for(int j=k;j<str.length();j++){
            if(isvowel(str.charAt(j))) count++;
            if(isvowel(str.charAt(j-k)))count--;
            max=Math.max(count,max);
        }
        System.out.print(max+" ");
    }

    public static boolean isvowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' ||ch =='o' || ch=='u';
    }
}