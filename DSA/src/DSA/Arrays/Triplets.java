//package DSA.Arrays;
//
//import java.util.*;
//
//public class Triplets {
//    public static int trip(int num[]){
//        List<List<Integer>> result=new ArrayList<List<Integer>>();
//        for(int i=0;i<num.length;i++){
//            for(int j=i+1;j<num.length;j++){
//
//                for(int k=j+1;k<num.length;k++){
//                    if(num[i]+num[j]+num[k]==0){
//                      //  System.out.println(+num[i]+","+num[j]+","+num[k]);
//                        List<Integer> triplet=new ArrayList<Integer>();
//                        triplet.add(num[i]);
//                        triplet.add(num[j]);
//                        triplet.add(num[k]);
//                        Collections.sort(triplet);
//                        result.add(triplet);
//                    }
//                }
//
//            }
//        }
//        result=new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
//        return result;
//    }
//    public static void main(String args[]){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int a[]=new int[n];
//        for(int i=0;i<n;i++)
//            a[i]=s.nextInt();
//        trip(a);
//    }
//
//}
