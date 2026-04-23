package DSA.String;

import java.util.*;
public class Mobile1 {
    public static String  mobile(String str){
        StringBuilder sb=new StringBuilder();

        for(char x:str.toLowerCase().toCharArray()){
            if(x>='a'&& x<='c')
                append(sb,'2',x-'a'+1);
            else if(x>='d'&& x<='f')
                append(sb,'3',x-'d'+1);
            else if(x>='g'&&x<='i')
                append(sb,'4',x-'g'+1);
            else if(x>='j'&& x<='l')
                append(sb,'5',x-'j'+1);
            else if(x>='m'&&x<='o')
                append(sb,'6',x-'m'+1);
            else if(x>='p'&& x<='r')
                append(sb,'7',x-'p'+1);
            else if(x>='s'&& x<='u')
                append(sb,'8',x-'s'+1);
            else if(x>='v'&& x<='z')
                append(sb,'9',x-'v'+1);
        }
        return sb.toString();
    }
    static void append(StringBuilder sb,char digit,int times){
        for(int i=0;i<times;i++)
            sb.append(digit);
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
         System.out.print(mobile(str));
    }
}
