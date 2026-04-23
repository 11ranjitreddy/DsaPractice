package DSA.Patterns;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=s.next().charAt(0);

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    }

}
