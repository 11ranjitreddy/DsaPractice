package DSA.Functions;

import java.util.Scanner;

public class AreaOfSquare {

    public static double area(double radius){
        double area=3.14*radius*radius;

        return area;
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        System.out.println(area(r));
    }
}
