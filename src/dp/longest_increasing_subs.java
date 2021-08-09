package dp;
import java.util.*;
// N = 16
// A[]={0,8,4,12,2,10,6,14,1,9,5
//      13,3,11,7,15}
// Output: 6
// Explanation:Longest increasing subsequence
// 0 2 6 9 13 15, which has length 6
class longest_increasing_subs{
    
    static int longestSubsequence(int size, int a[])
    {
        // int list=lis(a,size);
        int list=lis(arr,size);
        return list;
        
    }
    //O(nlogn)------------------------------------//
    static int lis(int a[],int n)
    {
      ArrayList<Integer> l=new ArrayList<>();
      int len=1;
      l.add(a[0]);
        for(int i=1;i<n;i++){
             
            if(a[i]>l.get(len-1)) {
                l.add(a[i]);
                len++;
            }
            else if(a[i]<l.get(len-1))
            {
                int fi=bs(l,a[i]);
                l.set(fi,a[i]);
            }
          
        }
        return len;
    }
    static int bs(ArrayList<Integer> l,int x){
        int low=0,high=l.size()-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(l.get(mid)>=x) high=mid;
            else low=mid+1;
        }
        return high;
    }
    //----------------------------------------------------------------------------------------//
    //---------------------------------O(n*n)-------------------------------------//
    // static int lis(int a[],int n)
    // {
    //     int dp[]=new int[n+1]; 
    //     dp[0]=1; int maxi=0; //min len of lis=1 for single element
    //     for(int i=1;i<n;i++)
    //     {int max=0;
    //         for(int j=0;j<i;j++){
    //             if(a[j]<a[i]) { //find maximum value of last lis till a[i]//check in which ele it can fit
    //                 if(dp[j]>max) max=dp[j]; //get max len of all subset in hich a[i] can be fit for lis
    //             }
    //         }
    //         dp[i]=max+1; //update dp[i]
    //         if(dp[i]>maxi) maxi=dp[i];
             
           
    //     }
    //     return maxi;
    // }
}