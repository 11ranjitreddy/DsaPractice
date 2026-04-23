package DSA.String;

import java.util.*;
public class MobileSeqence {

    public static String mobile(String str){
        StringBuilder sb=new StringBuilder();

        for(int x:str.toLowerCase().toCharArray()){
           if(x=='a' || x=='b' || x=='c')
               sb.append(2);
           else if(x=='d'|| x=='e'||x=='f')
               sb.append(3);
           else if(x=='g'||x=='h'|| x=='i')
               sb.append(4);
           else if(x=='j'|| x=='k'||x=='l')
               sb.append(5);
           else if(x=='m'||x=='n'||x=='o')
               sb.append(6);
           else if(x=='p'||x=='q'||x=='r')
               sb.append(7);
           else if(x=='s'||x=='t'||x=='u')
               sb.append(8);
           else sb.append(9);
        }
return new String(sb);
    }



    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
System.out.print(mobile(str));
    }
}
