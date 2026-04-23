package DSA.Greedy;

import java.util.*;
public class AcitivitySelectionProblem1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=s.nextInt();
            arr[i][1]=s.nextInt();
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));

        int maxAct=1;
        int lastEnd=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>=lastEnd){
                maxAct++;
                lastEnd=arr[i][1];
            }
        }
        System.out.print(maxAct);
    }

}
