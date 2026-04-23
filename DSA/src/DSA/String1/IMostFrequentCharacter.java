package DSA.String1;

public class IMostFrequentCharacter {
    public static void main(String args[]){
        String str = "risiranjitreddyrockybhai";
        int max=0;
        char result=' ';
        boolean seen[]=new boolean[256];
        for(char ch:str.toCharArray()){
            if(!seen[ch]){
                seen[ch]=true;
                int count=0;


                for(char c:str.toCharArray()){
                    if(c==ch)
                        count++;
                }
                if(count>max){
                    max=count;
                    result=ch;
                }

            }
        }
        System.out.println(max);
        System.out.println(result);
    }
}
