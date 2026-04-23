package DSA.Arrays;

public class MajorityElement1 {
    public static void main(String args[]){
        int nums[] = {2,2,1,1,1,2,2};

        int count=0;
        int candidate=0;
        for(int n:nums){
            if(count==0)
                candidate=n;

            if(n==candidate)
                count++;
            else
                count--;
        }
        System.out.print(candidate);
    }
}
