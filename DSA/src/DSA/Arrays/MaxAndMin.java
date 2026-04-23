package DSA.Arrays;


import java.util.*;

public class MaxAndMin {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        int a[]=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=s.nextInt();
//        }
//        int max=a[0],min=a[0];
//        for(int i=0;i<n;i++){
//            if(a[i]>max){
//                max=a[i];
//            }
//            if(a[i]<min){
//                min=a[i];
//            }
//        }
//        System.out.println("MAX "+max+" MIN "+min);
//

        //SECOND APPROACH
//        int max= Arrays.stream(a).max().getAsInt();
//        int min= Arrays.stream(a).min().getAsInt();
//        System.out.println("MAX "+max+" MIN "+min);

        //THIRD APPROACH

        List<Integer> aa=new ArrayList<>();
        for(int i=0;i<n;i++){
            aa.add(s.nextInt());
        }
        int max=Collections.max(aa);
        int min=Collections.min(aa);
        System.out.println("MAX "+max+" MIN "+min);
  }
}




