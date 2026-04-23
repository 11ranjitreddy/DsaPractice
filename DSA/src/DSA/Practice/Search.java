package DSA.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the text:");
        String text=s.nextLine();

        System.out.println("Enter the pattern:");
        String pattern=s.nextLine();

        List<Integer> indices= new ArrayList<>();
        int index=text.indexOf(pattern);

        while (index>=0){
            indices.add(index);
            index=text.indexOf(pattern,index+1);

        }
System.out.println("Pattern found at:"+indices);
    }

}
