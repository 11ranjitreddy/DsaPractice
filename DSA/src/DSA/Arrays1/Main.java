package DSA.Arrays1;

import java.util.*;
public class Main {
    public static void main(String args[]){
//       int a[]={1,2,3,4,5,6};
        //int a[] = {1,0,2,0,3,0,4};


        //MAXIMUM NUMBER;
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++){
//            if(a[i]>max){
//                max=a[i];
//            }
//        }
//        System.out.println(max);

        //SECOND LARGEST NUMBER;
//        int largest=Integer.MIN_VALUE;
//        int secondlargest=Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++){
//            if(a[i]>largest){
//                secondlargest=largest;
//                largest=a[i];
//            }else{
//                if(a[i]>secondlargest && a[i]!=largest){
//                    secondlargest=a[i];
//                }
//            }
//        }
//        System.out.println(secondlargest);

        //CHECK ARRAY IS SORTED OR NOT
       // int a[]={1,2,3,4,5,6,7};
//        boolean issorted=true;
//        for(int i=1;i<a.length;i++){
//            if(a[i]<a[i-1]){
//                issorted=false;
//                break;
//            }
//        }
//        if(issorted)System.out.println("true");
//        else System.out.println("false");


        //REMOVE DUPLICATES
//        int j=0;
//        boolean isseen[]=new boolean[256];
//        for(int i=0;i<a.length;i++){
//            if(!isseen[a[i]]){
//                isseen[a[i]]=true;
//                a[j]=a[i];
//                j++;
//            }
//        }
//        for(int i=0;i<=j;i++)
//            System.out.print(a[i]+" ");

//        for(int i=0;i<a.length;i++)
//            System.out.print(a[i]+" ");
//        System.out.println();
//        int first=a[0];
//        for(int i=1;i<a.length;i++){
//            a[i-1]=a[i];
//        }
//        a[a.length-1]=first;
//        for(int i=0;i<a.length;i++)
//            System.out.print(a[i]+" ");


//        Scanner s=new Scanner(System.in);
//        int k=s.nextInt();
//        for(int i=0;i<a.length;i++)
//            System.out.print(a[i]+" ");
//         int n=a.length;
//        int temp[]=new int[a.length];
//        for(int i=0;i<n;i++){
//            temp[(i+k)%n]=a[i];
//        }
//        System.out.println();
//        for(int i=0;i<n;i++)
//            System.out.print(temp[i]+" ");

        //MOVES ZEROS TO END
//        int n=a.length;
//        int temp[]= new int[n];
//        int j=0;
//        for(int i=0;i<a.length;i++){
//            if(a[i]!=0){
//                temp[j]=a[i];
//                j++;
//            }
//        }
//        for(int i=0;i<a.length;i++)
//            System.out.print(temp[i]+" ");

//        int x=3;
//        for(int i=0;i<a.length;i++){
//            if(a[i]==3){
//                System.out.println(i);
//            }
//        }

        //UNION
//        int a[]={1,2,3,4,5};
//        int b[]={2,3,5,6,7};
//        int temp[]=new int[20];
//        int k=0;
//        int i=0,j=0;
//        while (i<a.length && j<b.length){
//           if (a[i]<b[j]){
//             temp[k]=a[i];
//             i++;
//            }else if(a[i]>b[j]){
//               temp[k]=b[j];
//               j++;
//           }else{
//               temp[k]=a[i];
//               i++;j++;
//           }
//           k++;
//        }
//        while (i<a.length)temp[k++]=a[i++];
//        while (j<a.length)temp[k++]=b[j++];
//        for( i=0;i<k;i++)
//            System.out.print(temp[i]+" ");


        //INTESECTION

//        class Solution {
//            public int[] intersection(int[] nums1, int[] nums2) {
//
//                HashSet<Integer> set = new HashSet<>();
//                HashSet<Integer> result = new HashSet<>();
//
//                for(int num : nums1)
//                    set.add(num);
//
//                for(int num : nums2)
//                    if(set.contains(num))
//                        result.add(num);
//
//                int[] ans = new int[result.size()];
//                int i = 0;
//
//                for(int num : result)
//                    ans[i++] = num;
//
//                return ans;
//            }
//        }


//        int temp[]=new int[20];
//        int i=0,j=0,k=0;
//        while (i<a.length && j<b.length){
//            if(a[i]<b[j]){
//                i++;
//
//            }else if(a[i]>b[j]){
//                j++;
//            }else{
//                temp[k]=a[i];
//                i++;
//                j++;
//                k++;
//            }
//
//        }
//        for(int x=0;x<k;x++)
//            System.out.print(temp[x]+" ");


        //MISSING NUMBER DONE IN LEETCODE
//        class Solution {
//            public int missingNumber(int[] nums) {
//                int sum=0;
//                for(int i=0;i<nums.length;i++){
//                    sum+=nums[i];
//                }
//                int n=nums.length;
//
//                int count=(n*(n+1))/2;
//                int total=count-sum;
//                return total;
//            }
//        }

        //consecutive DONE IN LEETCODE
//        class Solution {
//            public int findMaxConsecutiveOnes(int[] nums) {
//                int count=0;
//                int max=0;
//                for(int i=0;i<nums.length;i++){
//                    if(nums[i]==1){
//                        count++;
//                        max=Math.max(max,count);
//                    }else{
//                        count=0;
//                    }
//                }
//                return max;
//            }
//        }

        //LONGESTSUBARRAYSUMBY K
//        int a[]={1, 2, 3, 1, 1, 1, 1 ,4 ,2 ,3};
//        int k=3;
//        int sum=0;
//        for(int i=0;i<k;i++)
//            sum+=a[i];
//        int max=sum;
//
//        for(int i=k;i<a.length;i++){
//            sum+=a[i];
//            sum-=a[i-k];
//            max=Math.max(sum,max);
//        }
//         System.out.print(max);

//        int a[]={1, 2, 3, 1, 1, 1, 1 ,4 ,2 ,3};
//        int k=3;
//        int sum=0,maxlen=0,left=0;
//        for(int i=0;i<a.length;i++){
//            sum+=a[i];
//            while (sum>k){
//                sum-=a[left];
//                left++;
//            }
//            if(sum==k){
//                maxlen=Math.max(maxlen,i-left+1);
//            }
//        }
//        System.out.print(maxlen);

//        int a[]={2,7,11,15};
//        int target=9;
//        int left=0;
//        int right=a.length-1;
//        while (left<right){
//            int sum=a[left]+a[right];
//            if(sum==target){
//                System.out.print(+left+" "+right);
//                break;
//            }else if(sum<target){
//                left++;
//            }else right--;
//        }

        //3SUM
//       int nums[] = {-1, 0, 1, 2, -1, -4};
//       Arrays.sort(nums);
//       List<List<Integer>>res=new ArrayList<>();
//
//       for(int i=0;i<nums.length-1;i++){
//           if(i>0 && nums[i]==nums[i-1])continue;
//           int left=i+1;
//           int right=nums.length-1;
//
//           while (left<right){
//               int sum=nums[i]+nums[left]+nums[right];
//               if(sum==0){
//                   res.add(Arrays.asList(nums[i],nums[left],nums[right]));
//
//                   while (left<right && nums[left]==nums[left+1])left++;
//                   while (left<right && nums[right]==nums[right-1])right--;
//
//                   left++;
//                   right--;
//               } else if (sum<0) {
//                   left++;
//               }else {
//                   right--;
//               }
//           }
//
//       }
//       System.out.print(res);

        //TAPPING RAIN WATER
//        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//        int n=height.length;
//
//        //left height
//        int left[]=new int[n];
//         left[0]=height[0];
//         for(int i=1;i<left.length;i++)
//             left[i]=Math.max(left[i-1],height[i]);
//
//         int right[]=new int[n];
//         right[n-1]=height[n-1];
//         for(int j=n-2;j>=0;j--)
//             right[j]=Math.max(right[j+1],height[j]);
//
//         int tapping=0;
//         for(int i=0;i<n;i++){
//             int waterflow=Math.min(left[i],right[i]);
//             tapping+=waterflow-height[i];
//         }
//System.out.print(tapping);


        //4SUM WAS DONE IN LEETCODE

        //CONTAINER WITH MOST WATER
//        int  height[] = {1,8,6,2,5,4,8,3,7};
//        int max=0;
//        int left=0;
//        int right=height.length-1;
//        while (left<right){
//            int width=right-left;
//            int ss=Math.min(height[left],height[right]);
//            max=Math.max(max,width*ss);
//            if(height[left]<height[right])
//                left++;
//            else
//                right--;
//        }
//System.out.print(max);

        //MAXIMUM SUM SUBARRAY OF SIZE K

//        int a[]={2,1,5,1,3,2};
//        int k=3;
//        int sum=0;
//        int max=0;
//        for(int i=0;i<k;i++)
//            sum+=a[i];
//        max=sum;
//        for(int i=k;i<a.length;i++){
//            sum+=a[i];
//            sum-=a[i-k];
//            max=Math.max(max,sum);
//        }
//        System.out.print(max);

//        int a[]={10,5,2,7,1,9};
//        int k=15;
//        int sum=0;
//        int max=0;
//        int left=0;
//
//        for(int i=0;i<a.length;i++){
//            sum+=a[i];
//
//            while (sum>k){
//                sum-=a[left];
//                left++;
//            }
//            if(sum==k){
//                max=Math.max(max,i-left+1);
//            }
//
//        }
//        System.out.print(max);

        //Longessubstring

//        HashSet<Character> set=new HashSet<>();
//        String str="abcabcac";
//        int left=0;
//        int max=0;
//        for(int right=0;right<str.length();right++){
//            while (set.contains(str.charAt(right))){
//                set.remove(str.charAt(left));
//                left++;
//            }
//            set.add(str.charAt(right));
//            max=Math.max(max,right-left+1);
//        }
//        System.out.print(max);

        
        //Longest Subarray with Sum K (with negatives)HashMap  DONE IN LEETCODE
        //FOUR SUM-2

        int nums1[] = {1,2}, nums2 []= {-2,-1}, nums3[] = {-1,2}, nums4 []= {0,2};
        HashMap<Integer,Integer> map=new HashMap();

        for(int a:nums1){
            for(int b:nums2){
                int sum=a+b;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int count=0;
        for(int c:nums3){
            for(int d:nums4){
                int sum=-(c+d);
                if(map.containsKey(sum)){
                    count+=map.get(sum);
                }
            }
        }
        System.out.print(count);
    }
}
