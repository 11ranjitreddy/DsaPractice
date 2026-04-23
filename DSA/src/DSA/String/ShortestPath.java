package DSA.String;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class ShortestPath {

    public static int displacement(String path){
        int x=0;
        int y=0;
        String t=path.toLowerCase();
        for(int i=0;i<path.length();i++){
            if(t.charAt(i)=='n')y+=1;
            else if(t.charAt(i)=='s') y-=1;
            else if(t.charAt(i)=='e') x+=1;
            else x-=1;
        }
        int xx=x*x;
        int yy=y*y;

        return (int)Math.sqrt(xx+yy);
    }
    public static void main(String  args[]){
        Scanner s=new Scanner(System.in);
        String p=s.nextLine();
        System.out.println(displacement(p));
    }
}
