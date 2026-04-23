package DSA.String;

import java.util.Scanner;

public class Concatination {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String firstname=s.nextLine();
        String lastname=s.nextLine();
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());
    }
}
