package DSA.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class PanagramOrNot {
    public static boolean isPanagram(String s){

        boolean [] isPresent=new boolean[26];
        int count=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                int index=c-'a';
                if(!isPresent[index]){
                    isPresent[index]=true;
                    count++;
                    if(count==26)
                        return true;
                }
            }
        }
        return count ==26;
    }

        public static  void  main(String args[]){
            Scanner ss=new Scanner(System.in);
            System.out.println("Enter any sentence: ");
            String s=ss.nextLine();

            if(isPanagram(s)){
                System.out.println("Entered String is Panagram: ");
            }else
            {
                System.out.println("Not a Panagram:");
            }
        }
    }

