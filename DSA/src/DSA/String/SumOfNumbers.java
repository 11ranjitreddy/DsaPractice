package DSA.String;

public class SumOfNumbers {
    public static void main(String args[]){
        String str="a10b20c30";
        int a[]=new int[10];
        int sum=0;
        String num="";
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                num+=ch;
            }else if(!num.isEmpty()){
                sum+=Integer.parseInt(num);
            }

        }
        System.out.println(sum);
    }
}
