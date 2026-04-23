package DSA.String;

public class CountDuplicates {
    public static String duplicates(String str){
        StringBuilder sb=new StringBuilder();

        int freq[]=new int[256];
        for(int i=0;i<str.length();i++)
            freq[str.charAt(i)]++;

        boolean isprinted[]=new boolean[256];
        for(char ch:str.toCharArray()){
            if(freq[ch]>1 && !isprinted[ch]){
                sb.append(ch);
                sb.append(freq[ch]);
                sb.append(" ");
                isprinted[ch]=true;
            }
        }
        return sb.toString();

    }

    public static void main(String args[]){
        String str="geeksforgreeks";
        System.out.print(duplicates(str));
    }
}
