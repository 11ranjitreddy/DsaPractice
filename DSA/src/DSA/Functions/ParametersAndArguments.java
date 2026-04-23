package DSA.Functions;

import java.util.Scanner;

public class ParametersAndArguments {
    public static int AreaOfRectangle(int a,int b){ //Formal parameters of parameters //definition
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        System.out.println("sum:"+AreaOfRectangle(n,m));//Actual parametes or Arguments  //call
    }
}
